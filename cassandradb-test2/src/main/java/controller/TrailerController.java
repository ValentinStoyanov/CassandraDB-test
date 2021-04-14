package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Owner;
import model.Trailer;
import repository.OwnerRepository;
import repository.TrailerRepository;

@RestController
@RequestMapping("trailer")
public class TrailerController {
	
	@Autowired 
	private TrailerRepository trailerRepository;
	
	
	@GetMapping(value = "getAll")
	public Iterable<Trailer> getAll(){
		return this.trailerRepository.findAll();
	}
	
	@PostMapping("create")
	public Iterable<Trailer> creat(@RequestBody List<Trailer> trailer){
		return this.trailerRepository.saveAll(trailer);
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		
		this.trailerRepository.deleteAll();
	
	}

}
