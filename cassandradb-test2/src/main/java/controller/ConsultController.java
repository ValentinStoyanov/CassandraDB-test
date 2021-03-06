package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.Camion;
import model.Carga;
import model.Conductor;
import model.OrigenDestino;
import model.Remolque;
import model.Viaje;
import repository.CamionRepository;
import repository.CargaRepository;
import repository.ConductorRepository;
import repository.OrigenDestinoRepository;
import repository.RemolqueRepository;
import repository.ViajeRepository;

@RestController
@RequestMapping("consulta")
public class ConsultController {

	@Autowired
	private ViajeRepository viajeRepository;
	
	@Autowired
	private ConductorRepository conductorRepository; 
	
	@Autowired
	private CamionRepository camionRepository;
	
	@Autowired
	private RemolqueRepository remolqueRepository;
	
	@Autowired
	private CargaRepository cargaRepository;
	
	@Autowired
	private OrigenDestinoRepository orepository;
	
	
	@GetMapping(value="getViaje")
    public String getConductor(@RequestParam String dni){
		
		Viaje viaje = this.viajeRepository.findByIdconductor(dni);
		
		Conductor conductor = this.conductorRepository.findByDni(dni);
		
		Camion camion = this.camionRepository.findByMatricula(viaje.getIdcamion());
		
		Remolque remolque = this.remolqueRepository.findByMatricula(viaje.getIdremolque());
		
		Carga carga = this.cargaRepository.findByCodigo(remolque.getIdcarga());
		
		OrigenDestino origen = this.orepository.findByDireccion(carga.getIdorigen());
		
		OrigenDestino destino = this.orepository.findByDireccion(carga.getIddestino());
		
		
		String resultado = "En este viaje el conductor tiene dni: "+ conductor.getDni() +" con nombre: "+ conductor.getNombre() +", el camion matricula : "+ camion.getMatricula()
		+ "y con el remolque: "+ remolque.getMatricula() + "\n"
		+ "en el que se carga:" + carga.getTipo() + "Con origen: "+ origen.getDireccion()+", y destino: "+destino.getDireccion();
        
		
        return resultado;
    }
	
	@GetMapping(value="getRutas")
	public String getViajes(@RequestParam int min, @RequestParam int max ) {
		

		String resultado = "";
		
		Carga carga;
		OrigenDestino origen;
		OrigenDestino destino;
		Remolque remolque;
		Viaje viaje;
		Conductor conductor;
		Camion camion;
		
		
		for (int i = min ; i < max; i++) {
			
			carga = this.cargaRepository.findByCodigo(i);
			
			origen = this.orepository.findByDireccion(carga.getIdorigen());
			
			destino = this.orepository.findByDireccion(carga.getIddestino());
			
			remolque = this.remolqueRepository.findByIdcarga(carga.getCodigo());
			
			viaje = this.viajeRepository.findByIdremolque(remolque.getMatricula());
			
			conductor = this.conductorRepository.findByDni(viaje.getIdconductor());
			
			camion = this.camionRepository.findByMatricula(viaje.getIdcamion());
			
			resultado = resultado + "Conductor dni: "+ conductor.getDni() +" Nombre: "+ conductor.getNombre() +"  Camion matricula : "+ camion.getMatricula()
			+ " Remolque matricula : "+ remolque.getMatricula() + "\n"
			+ " Carga: " + carga.getTipo() + " Origen: "+ origen.getDireccion()+" Destino: "+destino.getDireccion()+"\n \n";
			
		}
		
		
		
		
		return resultado;
	}
	
	
}
