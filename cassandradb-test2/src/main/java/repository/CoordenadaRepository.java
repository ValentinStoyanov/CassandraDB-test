package repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Carga;
import model.Coordenada;

@Repository
public interface CoordenadaRepository extends CrudRepository<Coordenada, Serializable>{

}
