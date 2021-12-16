package reto3.reto3.repository.crud;

import org.springframework.data.mongodb.repository.MongoRepository;
import reto3.reto3.model.Gadget;

public interface GadgetCrudRepository extends MongoRepository<Gadget,Integer> {
}
