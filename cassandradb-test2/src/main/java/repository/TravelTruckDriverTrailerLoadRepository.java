package repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.TravelTruckDriverTrailerLoad;


@Repository
public interface TravelTruckDriverTrailerLoadRepository extends CrudRepository<TravelTruckDriverTrailerLoad, Serializable>{

}
