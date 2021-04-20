package repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.TravelTruckDriverTrailer;

@Repository
public interface TravelTruckDriverTrailerRepository extends CrudRepository<TravelTruckDriverTrailer, Serializable>{

}
