package de.htwaalen.inse.backend.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Observation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Eindeutige Nummer für jede gemeldete Sichtung

    private LocalDate date; // Das Datum der Sichtung (z.B. 2026-06-08)
    private LocalTime time; // Die Uhrzeit der Sichtung (z.B. 11:42:00)

    // Eine Sichtung gehört zu genau einem Tier
    @ManyToOne
    private Animal animal;

    // Eine Sichtung gehört zu genau einem Ort
    @ManyToOne
    private Location location;
}