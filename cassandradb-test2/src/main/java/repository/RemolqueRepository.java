package repository;

import java.io.Serializable;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Carga;
import model.Remolque;

@Repository
public interface RemolqueRepository extends CrudRepository<Remolque, Serializable>{
	@Query(allowFiltering=true)
	Remolque findByMatricula(String idremolque);
	@Query(allowFiltering=true)
	Remolque findByIdcarga(int codigo);

}
