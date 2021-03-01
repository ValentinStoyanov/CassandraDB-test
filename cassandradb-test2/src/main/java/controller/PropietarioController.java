package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Propietario;
import repository.PropietarioRepository;



@RestController
@RequestMapping("propietario")
public class PropietarioController {
	
	@Autowired 
	private PropietarioRepository propietarioRepository;
	
	
	@GetMapping(value = "getAll")
	public Iterable<Propietario> getAll(){
		return this.propietarioRepository.findAll();
	}
	
	@PostMapping("create")
	public Iterable<Propietario> creat(@RequestBody List<Propietario> propietario){
		return this.propietarioRepository.saveAll(propietario);
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		
		this.propietarioRepository.deleteAll();
	
	}

}