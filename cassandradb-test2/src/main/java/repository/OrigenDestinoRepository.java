package repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Carga;
import model.OrigenDestino;

@Repository
public interface OrigenDestinoRepository extends CrudRepository<OrigenDestino, Serializable>{

	OrigenDestino findByDireccion(String idorigen);

}
