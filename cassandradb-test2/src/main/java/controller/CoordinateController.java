package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Coordinate;
import repository.CoordinateRepository;



@RestController
@RequestMapping("coordinate")
public class CoordinateController {
	
	@Autowired 
	private CoordinateRepository coordinateRepository;
	
	
	@GetMapping(value = "getAll")
	public Iterable<Coordinate> getAll(){
		return this.coordinateRepository.findAll();
	}
	
	@PostMapping("create")
	public Iterable<Coordinate> creat(@RequestBody List<Coordinate> coordinate){
		return this.coordinateRepository.saveAll(coordinate);
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		
		this.coordinateRepository.deleteAll();
	
	}

}
