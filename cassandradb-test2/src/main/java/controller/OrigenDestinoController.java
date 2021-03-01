package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.OrigenDestino;
import repository.OrigenDestinoRepository;


@RestController
@RequestMapping("origendestino")
public class OrigenDestinoController {
	
	@Autowired 
	private OrigenDestinoRepository origendestinoRepository;
	
	
	@GetMapping(value = "getAll")
	public Iterable<OrigenDestino> getAll(){
		return this.origendestinoRepository.findAll();
	}
	
	@PostMapping("create")
	public Iterable<OrigenDestino> creat(@RequestBody List<OrigenDestino> origendestino){
		return this.origendestinoRepository.saveAll(origendestino);
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		
		this.origendestinoRepository.deleteAll();
	
	}

}
