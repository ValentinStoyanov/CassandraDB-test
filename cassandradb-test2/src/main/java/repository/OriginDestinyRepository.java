package repository;

import java.io.Serializable;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Load;
import model.OriginDestiny;

@Repository
public interface OriginDestinyRepository extends CrudRepository<OriginDestiny, Serializable>{
	@Query(allowFiltering=true)
	OriginDestiny findByAddress(String idorigin);

}
