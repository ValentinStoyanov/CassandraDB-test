package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Load;
import model.Loadtrailer;
import model.Trailer;
import repository.LoadRepository;
import repository.LoadtrailerRepository;
import repository.TrailerRepository;

@RestController
@RequestMapping("loadtrailer")
public class LoadtrailerController {
	
	@Autowired
	private LoadtrailerRepository cargaremolqueRepository;

	@Autowired
	private LoadRepository cargaRepository;
	
	@Autowired
	private TrailerRepository remolqueRepository;
	
	@GetMapping(value = "getAll")
	public Iterable<Loadtrailer> getAll(){
		return this.cargaremolqueRepository.findAll();
	}
	

	@PostMapping(value = "insertallext")
	public Iterable<Loadtrailer> insertAllext() {
		
		
		Iterator<Load>  itc = this.cargaRepository.findAll().iterator();
		Iterator<Trailer>  itr = this.remolqueRepository.findAll().iterator();
		
		List<Trailer> lr = new ArrayList();
		List<Load> lc = new ArrayList();
		List<Loadtrailer> list = new ArrayList();
		
		Load carga = new Load();
		
		Loadtrailer cr ;
		
		while(itr.hasNext()) {
			
			lr.add(itr.next());
			
		}
		
		while(itc.hasNext()) {
			lc.add(itc.next());
		}
		
		for(int i = 0; i < lc.size();i++) {
			
			for(int j = 0; j<lr.size();j++) {
				
			
				if(lc.get(i).getCode()==lr.get(j).getIdload()) {
					
					// id, codigo, idcarga, iddestino, idorigen,  marca,  matricula,  modelo,  numerobastidor,  peso,  tipocarga,  tiporemolque
					
					
					list.add(new Loadtrailer(lc.get(i).getId(),
							lc.get(i).getCode(),
							lr.get(j).getIdload(),
							lc.get(i).getIddestiny(),
							lc.get(i).getIdorigin(),
							lr.get(j).getBrand(),
							lr.get(j).getRegistrationtag(),
							lr.get(j).getModel(),
							lr.get(j).getChassisnumber(),
							lc.get(i).getLoad(),
							lc.get(i).getType(),
							lr.get(j).getType()
							));
					
				}
			}
		}
		
		return this.cargaremolqueRepository.saveAll(list);
	
	}
		
	
	
	
	@PostMapping(value = "insertall")
	public Iterable<Loadtrailer> insertAll() {
		
		
		Iterator<Load>  itc = this.cargaRepository.findAll().iterator();
		Iterator<Trailer>  itr = this.remolqueRepository.findAll().iterator();
		
		List<Trailer> lr = new ArrayList();
		
		List<Loadtrailer> listcr = new ArrayList();
		
		
		while(itr.hasNext()) {
			lr.add(itr.next());
		}
		
		Load carga ;
		Trailer remolque;
		Loadtrailer cargaremolque;
		
		while(itc.hasNext()) {
			carga = itc.next();
			
			for(int i = 0; i < lr.size();i++) {
				if(lr.get(i).getIdload()==carga.getCode()) {
					remolque = lr.remove(i);
					
					cargaremolque = new Loadtrailer();
					cargaremolque.setId(carga.getId()+remolque.getId());
					cargaremolque.setCode(carga.getCode());
					cargaremolque.setIdload(remolque.getIdload());
					cargaremolque.setIddestiny(carga.getIddestiny());
					cargaremolque.setIdorigin(carga.getIdorigin());
					cargaremolque.setBrand(remolque.getBrand());
					cargaremolque.setRegistrationtag(remolque.getRegistrationtag());
					cargaremolque.setModel(remolque.getModel());
					cargaremolque.setChassisnumber(remolque.getChassisnumber());
					cargaremolque.setLoad(carga.getLoad());
					cargaremolque.setLoadtype(carga.getType());
					cargaremolque.setTrailertype(remolque.getType());
					
					listcr.add(cargaremolque);
					
					
				}
			}
			
			
			
		}
		
		return this.cargaremolqueRepository.saveAll(listcr);
				
		
	}
}
