package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Truck;
import repository.TruckRepository;

@RestController
@RequestMapping("truck")
public class TruckController {
	
	@Autowired 
	private TruckRepository truckRepository;
	
	@GetMapping(value = "getAll")
	public Iterable<Truck> getAll(){
		return this.truckRepository.findAll();
	}
	
	@PostMapping("create")
	public Iterable<Truck> creat(@RequestBody List<Truck> truck){
		return this.truckRepository.saveAll(truck);
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		
		this.truckRepository.deleteAll();
	}
	

}
