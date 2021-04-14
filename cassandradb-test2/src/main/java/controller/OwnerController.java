package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Owner;
import repository.OwnerRepository;



@RestController
@RequestMapping("owner")
public class OwnerController {
	
	@Autowired 
	private OwnerRepository ownerRepository;
	
	
	@GetMapping(value = "getAll")
	public Iterable<Owner> getAll(){
		return this.ownerRepository.findAll();
	}
	
	@PostMapping("create")
	public Iterable<Owner> creat(@RequestBody List<Owner> owner){
		return this.ownerRepository.saveAll(owner);
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		
		this.ownerRepository.deleteAll();
	
	}

}