package repository;

import java.io.Serializable;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Load;
import model.Trailer;

@Repository
public interface TrailerRepository extends CrudRepository<Trailer, Serializable>{
	@Query(allowFiltering=true)
	Trailer findByRegistrationtag(String idtrailer);
	@Query(allowFiltering=true)
	Trailer findByIdload(int code);

}
