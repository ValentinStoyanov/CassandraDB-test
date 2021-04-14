package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import model.Load;
import repository.LoadRepository;

@RestController
@RequestMapping("load")
public class LoadController {
	
	@Autowired 
	private LoadRepository loadRepository;
	
	
	@GetMapping(value = "getAll")
	public Iterable<Load> getAll(){
		return this.loadRepository.findAll();
	}
	
	@PostMapping("create")
	public Iterable<Load> creat(@RequestBody List<Load> load){
		return this.loadRepository.saveAll(load);
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		
		this.loadRepository.deleteAll();
	
	}

}
