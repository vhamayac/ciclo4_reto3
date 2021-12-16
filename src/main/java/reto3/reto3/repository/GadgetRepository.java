package reto3.reto3.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reto3.reto3.model.Gadget;
import reto3.reto3.repository.crud.GadgetCrudRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class GadgetRepository {
    @Autowired
    private GadgetCrudRepository gadgetCrudRepository;

    public List<Gadget> getAll(){
        return gadgetCrudRepository.findAll();
    }

    public Optional<Gadget> getGadget(int id){
        return gadgetCrudRepository.findById(id);
    }

    public Gadget create(Gadget gadget){
        return gadgetCrudRepository.save(gadget);
    }

    public void update(Gadget gadget){
        gadgetCrudRepository.save(gadget);
    }

    public void delete(Gadget gadget){
        gadgetCrudRepository.delete(gadget);
    }

}
