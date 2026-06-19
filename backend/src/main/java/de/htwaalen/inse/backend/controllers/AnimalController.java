package de.htwaalen.inse.backend.controllers;

import de.htwaalen.inse.backend.entities.Animal;
import de.htwaalen.inse.backend.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// Klasse erstellen zu AnimalController
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/animal")
public class AnimalController {
S
    @Autowired
    private AnimalRepository repository;

    @PostMapping
    public Animal createAnimal(@RequestBody Animal animal) {
        return repository.save(animal);
    }

    @GetMapping
    public List<Animal> getAllAnimals() {
        return repository.findAll();
    }
}