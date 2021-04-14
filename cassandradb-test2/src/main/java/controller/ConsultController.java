package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.Truck;
import model.Load;
import model.Driver;
import model.OriginDestiny;
import model.Trailer;
import model.Travel;
import repository.TruckRepository;
import repository.LoadRepository;
import repository.DriverRepository;
import repository.OriginDestinyRepository;
import repository.TrailerRepository;
import repository.TravelRepository;

@RestController
@RequestMapping("consulta")
public class ConsultController {

	@Autowired
	private TravelRepository viajeRepository;
	
	@Autowired
	private DriverRepository conductorRepository; 
	
	@Autowired
	private TruckRepository camionRepository;
	
	@Autowired
	private TrailerRepository remolqueRepository;
	
	@Autowired
	private LoadRepository cargaRepository;
	
	@Autowired
	private OriginDestinyRepository orepository;
	
	
	@GetMapping(value="getViaje")
    public String getConductor(@RequestParam String dni){
		
		Travel viaje = this.viajeRepository.findByIddriver(dni);
		
		Driver conductor = this.conductorRepository.findByDni(dni);
		
		Truck camion = this.camionRepository.findByRegistrationtag(viaje.getIdtruck());
		
		Trailer remolque = this.remolqueRepository.findByRegistrationtag(viaje.getIdtrailer());
		
		Load carga = this.cargaRepository.findByCode(remolque.getIdload());
		
		OriginDestiny origen = this.orepository.findByAddress(carga.getIdorigin());
		
		OriginDestiny destino = this.orepository.findByAddress(carga.getIddestiny());
		
		
		String resultado = "En este viaje el conductor tiene dni: "+ conductor.getDni() +" con nombre: "+ conductor.getName() +", el camion matricula : "+ camion.getRegistrationtag()
		+ "y con el remolque: "+ remolque.getRegistrationtag() + "\n"
		+ "en el que se carga:" + carga.getType() + "Con origen: "+ origen.getAddress()+", y destino: "+destino.getAddress();
        
		
        return resultado;
    }
	
	@GetMapping(value="getRutas")
	public String getViajes(@RequestParam int min, @RequestParam int max ) {
		

		String resultado = "";
		
		Load carga;
		OriginDestiny origen;
		OriginDestiny destino;
		Trailer remolque;
		Travel viaje;
		Driver conductor;
		Truck camion;
		
		
		for (int i = min ; i < max; i++) {
			
			carga = this.cargaRepository.findByCode(i);
			
			origen = this.orepository.findByAddress(carga.getIdorigin());
			
			destino = this.orepository.findByAddress(carga.getIddestiny());
			
			remolque = this.remolqueRepository.findByIdload(carga.getCode());
			
			viaje = this.viajeRepository.findByIdtrailer(remolque.getRegistrationtag());
			
			conductor = this.conductorRepository.findByDni(viaje.getIddriver());
			
			camion = this.camionRepository.findByRegistrationtag(viaje.getIdtruck());
			
			resultado = resultado + "Conductor dni: "+ conductor.getDni() +" Nombre: "+ conductor.getName() +"  Camion matricula : "+ camion.getRegistrationtag()
			+ " Remolque matricula : "+ remolque.getRegistrationtag() + "\n"
			+ " Carga: " + carga.getType() + " Origen: "+ origen.getAddress()+" Destino: "+destino.getAddress()+"\n \n";
			
		}
		
		
		
		
		return resultado;
	}
	
	
}
