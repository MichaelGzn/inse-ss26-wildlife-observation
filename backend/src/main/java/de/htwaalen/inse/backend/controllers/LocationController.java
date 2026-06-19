package de.htwaalen.inse.backend.controllers;

import de.htwaalen.inse.backend.entities.Location;
import de.htwaalen.inse.backend.repositories.LocationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Klasse für LocationController wird erstellt
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/location")
public class LocationController {

    private final LocationRepository repository;

    public LocationController(LocationRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Location createLocation(@RequestBody Location location) {
        return repository.save(location);
    }

    @GetMapping
    public List<Location> getAllLocations() {
        return repository.findAll();
    }
}