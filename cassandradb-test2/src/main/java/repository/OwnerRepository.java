package repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Load;
import model.Owner;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Serializable>{

}
