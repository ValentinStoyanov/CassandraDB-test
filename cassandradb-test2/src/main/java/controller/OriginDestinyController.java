package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.OriginDestiny;
import repository.OriginDestinyRepository;


@RestController
@RequestMapping("origindestiny")
public class OriginDestinyController {
	
	@Autowired 
	private OriginDestinyRepository origindestinyRepository;
	
	
	@GetMapping(value = "getAll")
	public Iterable<OriginDestiny> getAll(){
		return this.origindestinyRepository.findAll();
	}
	
	@PostMapping("create")
	public Iterable<OriginDestiny> creat(@RequestBody List<OriginDestiny> origindestiny){
		return this.origindestinyRepository.saveAll(origindestiny);
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		
		this.origindestinyRepository.deleteAll();
	
	}

}
