package repository;

import java.io.Serializable;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Carga;
import model.OrigenDestino;

@Repository
public interface OrigenDestinoRepository extends CrudRepository<OrigenDestino, Serializable>{
	@Query(allowFiltering=true)
	OrigenDestino findByDireccion(String idorigen);

}
