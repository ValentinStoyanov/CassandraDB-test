package repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Camion;

@Repository
public interface CamionRepository extends CrudRepository<Camion, Serializable>{

	Camion findByMatricula(String idcamion);

}
