package de.htwaalen.inse.backend.controllers;

import de.htwaalen.inse.backend.entities.Genus;
import de.htwaalen.inse.backend.repositories.GenusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Sagt Spring Boot: "Das hier ist ein Empfangsschalter für APIs!"
@CrossOrigin(origins = "*")
@RequestMapping("/api/genus") // Die URL, unter der die Tür erreichbar ist
public class GenusController {

    @Autowired // Holt sich den Lagerarbeiter
    private GenusRepository repository;

    // POST: Nimmt Daten von Postman und speichert sie
    @PostMapping
    public Genus createGenus(@RequestBody Genus genus) {
        return repository.save(genus);
    }

    // GET: Holt alle gespeicherten Gattungen aus der Datenbank
    @GetMapping
    public List<Genus> getAllGenera() {
        return repository.findAll();
    }
}