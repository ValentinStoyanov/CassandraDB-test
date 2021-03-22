package repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Camion;
import model.Cargaremolque;

@Repository
public interface CargaremolqueRepository extends CrudRepository<Cargaremolque, Serializable>{

}
