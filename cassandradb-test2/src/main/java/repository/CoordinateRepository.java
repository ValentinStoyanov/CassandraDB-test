package repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Load;
import model.Coordinate;

@Repository
public interface CoordinateRepository extends CrudRepository<Coordinate, Serializable>{

}
