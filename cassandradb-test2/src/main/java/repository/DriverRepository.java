package repository;

import java.io.Serializable;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Load;
import model.Driver;

@Repository
public interface DriverRepository extends CrudRepository<Driver, Serializable>{
	@Query(allowFiltering=true)
	Driver findByDni(String dni);

}
