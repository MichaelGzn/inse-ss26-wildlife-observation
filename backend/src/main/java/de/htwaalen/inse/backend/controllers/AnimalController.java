package de.htwaalen.inse.backend.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.htwaalen.inse.backend.entities.Animal;
import de.htwaalen.inse.backend.repositories.AnimalRepository;
//Erstelle eine Klasse AnimalController
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/animal")
public class AnimalController {

 private final AnimalRepository repository;

 // Erstelle einen Konstruktor (ohne @Autowired, da es automatisch passiert!)
     public AnimalController(AnimalRepository repository) {
     this.repository = repository;
 }

 @PostMapping
 public Animal createAnimal(@RequestBody Animal animal) {
     return repository.save(animal);
 }

 @GetMapping
 public List<Animal> getAllAnimals() {
     return repository.findAll();
 }
}