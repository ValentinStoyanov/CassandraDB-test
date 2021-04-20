package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Driver;
import model.Trailer;
import model.Travel;
import model.TravelTruckDriverTrailer;
import model.Truck;
import repository.DriverRepository;
import repository.TrailerRepository;
import repository.TravelRepository;
import repository.TravelTruckDriverTrailerRepository;
import repository.TruckRepository;

@RestController
@RequestMapping("TravelTruckDriverTrailer")
public class TravelTruckDriverTrailerController {
	
	@Autowired
	private TravelTruckDriverTrailerRepository ttdtRepository;
	
	
	@Autowired
	private TravelRepository travelRepository;
	
	@Autowired
	private DriverRepository driverRepository;
	
	@Autowired
	private TruckRepository truckRepository;
	
	@Autowired
	private TrailerRepository trailerRepository;
	
	
	@GetMapping(value = "getAll")
	public Iterable<TravelTruckDriverTrailer> getAll(){
		return this.ttdtRepository.findAll();
	}
	
	@PostMapping(value = "insertAll")
	public Iterable<TravelTruckDriverTrailer> insertAll(){
		
		String aaa = "";
		
		List<TravelTruckDriverTrailer> lista =  new ArrayList();
		
		Iterator<Travel> it_travel = this.travelRepository.findAll().iterator();
		
		Iterator<Driver> it_driver = this.driverRepository.findAll().iterator();
		
		Iterator<Truck> it_truck = this.truckRepository.findAll().iterator();
		
		Iterator<Trailer> it_trailer = this.trailerRepository.findAll().iterator();
		
		List<Travel> l_travel = new ArrayList<Travel>();
		
		List<Driver> l_driver = new ArrayList<Driver>();
		
		List<Trailer> l_trailer = new ArrayList<Trailer>();
		
		List<Truck> l_truck = new ArrayList<Truck>();
		
		
		while(it_trailer.hasNext()) {
			
			l_trailer.add(it_trailer.next());
			
		}
		
		while(it_truck.hasNext()) {
			
			l_truck.add(it_truck.next());
		}
		
		
		while(it_travel.hasNext()) {
			
			l_travel.add(it_travel.next());
			
		}
		
		while(it_driver.hasNext()) {
			
			l_driver.add(it_driver.next());
			
		}
		
		
		for(int i = 0; i < l_travel.size();i++) {
						
			for(int j = 0; j < l_driver.size();j++) {
				
				
				if(l_travel.get(i).getIddriver().equals(l_driver.get(j).getDni())) {
					
					
					lista.add(new TravelTruckDriverTrailer(l_travel.get(i).getIdtruck(),
							l_travel.get(i).getIddriver(),
							l_travel.get(i).getIdtrailer(),
							"",
							"",
							l_driver.get(j).getDni()));
					
				}
				
			}
			
		}
		
		for(int i = 0; i < lista.size();i++) {
			
			for (int j = 0; j < l_truck.size();j++) {
				
				if(lista.get(i).getIdtruck().equals(l_truck.get(j).getRegistrationtag())) {
					
					lista.get(i).setRegistrationtagtruck(l_truck.get(j).getRegistrationtag());
					
				}
				
			}
			
		}
		
		
		for(int i = 0; i < lista.size();i++) {
			
			for (int j = 0; j < l_trailer.size(); j++) {
				
				if(lista.get(i).getIdtrailer().equals(l_trailer.get(j).getRegistrationtag())) {
					
					lista.get(i).setRegistrationtagtrailer(l_trailer.get(j).getRegistrationtag());
					
				}
				
			}
			
		}
		
		
		
		return this.ttdtRepository.saveAll(lista);
	}

}
