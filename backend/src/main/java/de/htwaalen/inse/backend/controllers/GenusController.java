package de.htwaalen.inse.backend.controllers;

import de.htwaalen.inse.backend.entities.Genus;
import de.htwaalen.inse.backend.repositories.GenusRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Spring Boot: "ein Empfangsschalter für APIs"
@CrossOrigin(origins = "*")
@RequestMapping("/api/genus") // Ein URL welches unter der Tür erreichbar
public class GenusController {

    private final GenusRepository repository;

    // Der Lagerarbeiter wird hier geholt
    public GenusController(GenusRepository repository) {
        this.repository = repository;
    }

    // POST: Die Daten werden vom Postman erlangt und gespeichert
    @PostMapping
    public Genus createGenus(@RequestBody Genus genus) {
        return repository.save(genus);
    }

    // GET: alle gespeicherten Gattungen aus der Datenbank werden geholtS
    @GetMapping
    public List<Genus> getAllGenera() {
        return repository.findAll();
    }
}