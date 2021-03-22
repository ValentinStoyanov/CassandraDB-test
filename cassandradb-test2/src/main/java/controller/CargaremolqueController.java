package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Carga;
import model.Cargaremolque;
import model.Remolque;
import repository.CargaRepository;
import repository.CargaremolqueRepository;
import repository.RemolqueRepository;

@RestController
@RequestMapping("cargaremolque")
public class CargaremolqueController {
	
	@Autowired
	private CargaremolqueRepository cargaremolqueRepository;

	@Autowired
	private CargaRepository cargaRepository;
	
	@Autowired
	private RemolqueRepository remolqueRepository;
	
	@GetMapping(value = "getAll")
	public Iterable<Cargaremolque> getAll(){
		return this.cargaremolqueRepository.findAll();
	}
	

	@PostMapping(value = "insertallext")
	public List<Remolque> insertAllext() {
		
		Iterator<Carga>  itc = this.cargaRepository.findAll().iterator();
		Iterator<Remolque>  itr = this.remolqueRepository.findAll().iterator();
		
		List<Remolque> lr = new ArrayList();
		
		while(itr.hasNext()) {
			
			lr.add(itr.next());
			
		}
		
		
		
		
			
		return lr;
	}
		
	
	
	
	@PostMapping(value = "insertall")
	public Iterable<Cargaremolque> insertAll() {
		
		
		Iterator<Carga>  itc = this.cargaRepository.findAll().iterator();
		Iterator<Remolque>  itr = this.remolqueRepository.findAll().iterator();
		
		List<Remolque> lr = new ArrayList();
		
		List<Cargaremolque> listcr = new ArrayList();
		
		
		while(itr.hasNext()) {
			lr.add(itr.next());
		}
		
		Carga carga ;
		Remolque remolque;
		Cargaremolque cargaremolque;
		
		while(itc.hasNext()) {
			carga = itc.next();
			
			for(int i = 0; i < lr.size();i++) {
				if(lr.get(i).getIdcarga()==carga.getCodigo()) {
					remolque = lr.remove(i);
					
					cargaremolque = new Cargaremolque();
					cargaremolque.setId(carga.getId()+remolque.getId());
					cargaremolque.setCodigo(carga.getCodigo());
					cargaremolque.setIdcarga(remolque.getIdcarga());
					cargaremolque.setIddestino(carga.getIddestino());
					cargaremolque.setIdorigen(carga.getIdorigen());
					cargaremolque.setMarca(remolque.getMarca());
					cargaremolque.setMatricula(remolque.getMatricula());
					cargaremolque.setModelo(remolque.getModelo());
					cargaremolque.setNumerobastidor(remolque.getNumerobastidor());
					cargaremolque.setPeso(carga.getPeso());
					cargaremolque.setTipocarga(carga.getTipo());
					cargaremolque.setTiporemolque(remolque.getTipo());
					
					listcr.add(cargaremolque);
					
					
				}
			}
			
			
			
		}
		
		return this.cargaremolqueRepository.saveAll(listcr);
				
		
	}
}
