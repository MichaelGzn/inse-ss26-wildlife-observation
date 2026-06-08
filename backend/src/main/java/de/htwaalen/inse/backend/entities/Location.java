package de.htwaalen.inse.backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lnr; // Die vom Prof geforderte Location-Nummer (LNr)

    private String shorttitle;  // Name des Ortes (z.B. "Hochsitz am Waldrand")
    private String description; // Beschreibung (z.B. "Nahe der großen Eiche, gute Sicht")
    
    // Die GPS-Daten, die wir später für Google Maps brauchen
    private Double latitude;    // Breitengrad (z.B. 48.837)
    private Double longitude;   // Längengrad (z.B. 10.093)
}