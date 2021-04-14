package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Travel;
import repository.TravelRepository;


@RestController
@RequestMapping("travel")
public class TravelController {
	
	@Autowired 
	private TravelRepository travelRepository;
	
	
	@GetMapping(value = "getAll")
	public Iterable<Travel> getAll(){
		return this.travelRepository.findAll();
	}
	
	@PostMapping("create")
	public Iterable<Travel> creat(@RequestBody List<Travel> travel){
		return this.travelRepository.saveAll(travel);
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		
		this.travelRepository.deleteAll();
	
	}

	

}
