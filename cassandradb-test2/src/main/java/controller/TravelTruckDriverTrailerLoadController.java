package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Load;
import model.TravelTruckDriverTrailer;
import model.TravelTruckDriverTrailerLoad;
import repository.LoadRepository;
import repository.TravelTruckDriverTrailerLoadRepository;
import repository.TravelTruckDriverTrailerRepository;

@RestController
@RequestMapping("TravelTruckDriverTrailerLoad")
public class TravelTruckDriverTrailerLoadController {

	@Autowired 
	private TravelTruckDriverTrailerLoadRepository ttdtcRepository;
	
	
	@Autowired 
	private TravelTruckDriverTrailerRepository ttdtRepository;
	
	
	@Autowired
	private  LoadRepository loadRepository;
	
	
	@GetMapping(value = "getAll")
	public Iterable<TravelTruckDriverTrailerLoad> getAll(){
		return this.ttdtcRepository.findAll();
	}
	
	
	@PostMapping(value = "insertALL")
	public List<TravelTruckDriverTrailerLoad> insertAll() {
		
		Iterator<TravelTruckDriverTrailer> it = this.ttdtRepository.findAll().iterator();
		
		Iterator<Load> it_load = this.loadRepository.findAll().iterator();
		
		List<TravelTruckDriverTrailer> list = new ArrayList<TravelTruckDriverTrailer>();
		
		List<Load> list_load = new ArrayList<Load>();
		
		List<TravelTruckDriverTrailerLoad> list_final = new ArrayList<TravelTruckDriverTrailerLoad>();
		
		
		
		while(it_load.hasNext()) {
			
			list_load.add(it_load.next());
			
		}
		
		
		while(it.hasNext()) {
			
			list.add(it.next());
		}
		
		
		for(int i = 0; i < list.size();i++) {
			
			for(int j = 0; j < list_load.size(); j++) {
				
				if( list.get(i).getCode()==list_load.get(j).getCode()) {
					
					list_final.add(new TravelTruckDriverTrailerLoad(
							list.get(i).getIdtruck(),
							list.get(i).getIddriver(),
							list.get(i).getIdtrailer(),
							list.get(i).getRegistrationtagtruck(),
							list.get(i).getRegistrationtagtrailer(),
							list.get(i).getDni(),
							list.get(i).getCode(),
							list_load.get(j).getCode()
							));
					
				}
			}
		}
		
		
		
		return list_final;
		
		
	}
	
}
