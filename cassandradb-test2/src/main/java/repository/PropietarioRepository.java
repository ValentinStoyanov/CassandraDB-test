package repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Carga;
import model.Propietario;

@Repository
public interface PropietarioRepository extends CrudRepository<Propietario, Serializable>{

}
