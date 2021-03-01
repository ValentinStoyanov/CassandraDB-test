package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Camion;
import repository.CamionRepository;

@RestController
@RequestMapping("camion")
public class CamionController {
	
	@Autowired 
	private CamionRepository camionRepository;
	
	@GetMapping(value = "getAll")
	public Iterable<Camion> getAll(){
		return this.camionRepository.findAll();
	}
	
	@PostMapping("create")
	public Iterable<Camion> creat(@RequestBody List<Camion> camion){
		return this.camionRepository.saveAll(camion);
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		
		this.camionRepository.deleteAll();
	}
	

}
