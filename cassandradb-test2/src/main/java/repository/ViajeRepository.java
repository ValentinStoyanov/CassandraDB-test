package repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Carga;
import model.Viaje;

@Repository
public interface ViajeRepository extends CrudRepository<Viaje, Serializable>{

	Viaje findByIdconductor(String dni);

}
