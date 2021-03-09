package repository;

import java.io.Serializable;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Carga;
import model.Viaje;

@Repository
public interface ViajeRepository extends CrudRepository<Viaje, Serializable>{
	@Query(allowFiltering=true)
	Viaje findByIdconductor(String dni);
	@Query(allowFiltering=true)
	Viaje findByIdremolque(String matricula);

}
