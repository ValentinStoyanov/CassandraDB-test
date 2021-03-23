package repository;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Carga;

@Repository
public interface CargaRepository extends CrudRepository<Carga, Serializable>{
	@Query(allowFiltering=true)
	Carga findByCodigo(int idcarga);
	
	@Query(allowFiltering=true)
	List<Carga> findByCodigoGreaterThanOrderByCodigo(int codigo);
	

}
