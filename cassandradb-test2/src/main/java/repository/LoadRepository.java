package repository;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Load;

@Repository
public interface LoadRepository extends CrudRepository<Load, Serializable>{
	@Query(allowFiltering=true)
	Load findByCode(int idload);
	
	@Query(allowFiltering=true)
	List<Load> findByCodeGreaterThanOrderByCode(int code);
	

}
