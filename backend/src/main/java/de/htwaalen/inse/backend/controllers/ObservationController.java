package de.htwaalen.inse.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.htwaalen.inse.backend.entities.Observation;
import de.htwaalen.inse.backend.repositories.ObservationRepository;
// ObservationRepsitory Klasse wurde hier erstelltS
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RestController
@RequestMapping("/api/observation")
public class ObservationController {

    @Autowired
    private ObservationRepository repository;

    @PostMapping
    public Observation createObservation(@RequestBody Observation observation) {
        return repository.save(observation);
    }

    @GetMapping
    public List<Observation> getAllObservations() {
        return repository.findAll();
    }
    @DeleteMapping("/{id}")
    public void deleteObservation(@PathVariable Long id) {
        repository.deleteById(id);
    }
}