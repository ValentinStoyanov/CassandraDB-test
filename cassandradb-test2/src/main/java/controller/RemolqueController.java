package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Propietario;
import model.Remolque;
import repository.PropietarioRepository;
import repository.RemolqueRepository;

@RestController
@RequestMapping("remolque")
public class RemolqueController {
	
	@Autowired 
	private RemolqueRepository remolqueRepository;
	
	
	@GetMapping(value = "getAll")
	public Iterable<Remolque> getAll(){
		return this.remolqueRepository.findAll();
	}
	
	@PostMapping("create")
	public Iterable<Remolque> creat(@RequestBody List<Remolque> remolque){
		return this.remolqueRepository.saveAll(remolque);
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		
		this.remolqueRepository.deleteAll();
	
	}

}
