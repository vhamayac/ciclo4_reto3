package reto3.reto3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reto3.reto3.model.Gadget;
import reto3.reto3.service.GadgetService;

import java.util.List;

@RestController
@RequestMapping("/api/gadget")
@CrossOrigin(origins = "*"/**, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE}*/)
public class GadgetController {

    @Autowired
    private GadgetService gadgetService;

    @GetMapping("/all")
    public List<Gadget> getAll() {
        return gadgetService.getAll();
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Gadget gadget) {
        gadgetService.create(gadget);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Gadget update(@RequestBody Gadget gadget) {
        return gadgetService.update(gadget);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id) {
        return gadgetService.delete(id);
    }
}
