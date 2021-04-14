package repository;

import java.io.Serializable;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Load;
import model.Travel;

@Repository
public interface TravelRepository extends CrudRepository<Travel, Serializable>{
	@Query(allowFiltering=true)
	Travel findByIddriver(String dni);
	@Query(allowFiltering=true)
	Travel findByIdtrailer(String matricula);

}
