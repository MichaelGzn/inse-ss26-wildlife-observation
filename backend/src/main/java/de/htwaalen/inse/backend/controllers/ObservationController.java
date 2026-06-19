package de.htwaalen.inse.backend.controllers;

import de.htwaalen.inse.backend.entities.Observation;
import de.htwaalen.inse.backend.repositories.ObservationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//ObservationRepository Klasse wurde hier erstellt
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RestController
@RequestMapping("/api/observation")
public class ObservationController {

    private final ObservationRepository repository;

    public ObservationController(ObservationRepository repository) {
        this.repository = repository;
    }

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