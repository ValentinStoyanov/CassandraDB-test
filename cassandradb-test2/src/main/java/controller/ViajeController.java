package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Viaje;
import repository.ViajeRepository;


@RestController
@RequestMapping("viaje")
public class ViajeController {
	
	@Autowired 
	private ViajeRepository viajeRepository;
	
	
	@GetMapping(value = "getAll")
	public Iterable<Viaje> getAll(){
		return this.viajeRepository.findAll();
	}
	
	@PostMapping("create")
	public Iterable<Viaje> creat(@RequestBody List<Viaje> viaje){
		return this.viajeRepository.saveAll(viaje);
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		
		this.viajeRepository.deleteAll();
	
	}

	

}
