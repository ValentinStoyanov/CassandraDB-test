package repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Carga;
import model.Conductor;

@Repository
public interface ConductorRepository extends CrudRepository<Conductor, Serializable>{

}
