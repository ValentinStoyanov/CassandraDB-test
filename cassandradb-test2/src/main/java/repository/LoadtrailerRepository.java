package repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Truck;
import model.Loadtrailer;

@Repository
public interface LoadtrailerRepository extends CrudRepository<Loadtrailer, Serializable>{

}
