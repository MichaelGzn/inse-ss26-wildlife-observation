package de.htwaalen.inse.backend.entities;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

//ichtung wird als Tabelle in der Datenbank gespeichert 
@Entity
public class Observation {
	
	//EIndeutige ID für jede Beobachtung 
    @Id
    
    //DIe Id wird automatisch erstellt 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Datum und Uhrzeit der Beobachtung 
    private LocalDate date;
    private LocalTime time;

    //Eine Beobachtung gehört zu einem bestimmten Tier 
    @ManyToOne(cascade = CascadeType.ALL)
    private Animal animal;

    //Eine Beobachtung findet an einem bestimmten Ort statt
    @ManyToOne(cascade = CascadeType.ALL)
    private Location location;

    //Getter und Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}