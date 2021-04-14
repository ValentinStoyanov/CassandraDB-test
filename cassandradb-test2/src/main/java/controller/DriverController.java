package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Driver;
import repository.DriverRepository;


@RestController
@RequestMapping("driver")
public class DriverController {
	
	
	@Autowired 
	private DriverRepository driverRepository;
	
	
	@GetMapping(value = "getAll")
	public Iterable<Driver> getAll(){
		return this.driverRepository.findAll();
	}
	
	@PostMapping("create")
	public Iterable<Driver> creat(@RequestBody List<Driver> driver){
		return this.driverRepository.saveAll(driver);
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		
		this.driverRepository.deleteAll();
	
	}

}
