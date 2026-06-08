package de.htwaalen.inse.backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Die eindeutige Nummer des Tieres [cite: 33]

    private Double estimatedWeight; // Geschätztes Gewicht in kg (z.B. 85.5) 
    private Double estimatedSize;   // Geschätzte Größe in cm (z.B. 120.0) [cite: 31]
    private Integer estimatedAge;   // Geschätztes Alter in Jahren (z.B. 3) [cite: 43]
    private String gender;          // Geschlecht (z.B. "Männlich", "Weiblich") [cite: 44]

    // Das ist die "has"-Beziehung aus dem Diagramm: Viele Tiere gehören zu einer Gattung 
    @ManyToOne
    private Genus genus; 
}