package de.htwaalen.inse.backend.controllers;

import de.htwaalen.inse.backend.entities.Observation;
import de.htwaalen.inse.backend.repositories.ObservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
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
}