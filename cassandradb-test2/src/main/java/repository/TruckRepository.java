package repository;

import java.io.Serializable;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Truck;

@Repository

public interface TruckRepository extends CrudRepository<Truck, Serializable>{
	
	@Query(allowFiltering=true)
	Truck findByRegistrationtag(String idtruck);

}
