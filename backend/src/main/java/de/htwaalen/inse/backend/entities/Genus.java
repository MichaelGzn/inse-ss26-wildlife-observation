package de.htwaalen.inse.backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Genus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String designation;
    
    private String latinDesignation;

    //(Getter und Setter)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getLatinDesignation() {
        return latinDesignation;
    }

    public void setLatinDesignation(String latinDesignation) {
        this.latinDesignation = latinDesignation;
    }
}