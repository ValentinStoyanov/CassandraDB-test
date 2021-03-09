package repository;

import java.io.Serializable;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Camion;

@Repository

public interface CamionRepository extends CrudRepository<Camion, Serializable>{
	
	@Query(allowFiltering=true)
	Camion findByMatricula(String idcamion);

}
