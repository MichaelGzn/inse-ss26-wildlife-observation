package de.htwaalen.inse.backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double estimatedWeight;
    private Double estimatedSize;
    private Integer estimatedAge;
    private String gender;

    @ManyToOne
    private Genus genus;

    // --- Getter und Setter ---

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getEstimatedWeight() {
        return estimatedWeight;
    }

    public void setEstimatedWeight(Double estimatedWeight) {
        this.estimatedWeight = estimatedWeight;
    }

    public Double getEstimatedSize() {
        return estimatedSize;
    }

    public void setEstimatedSize(Double estimatedSize) {
        this.estimatedSize = estimatedSize;
    }

    public Integer getEstimatedAge() {
        return estimatedAge;
    }

    public void setEstimatedAge(Integer estimatedAge) {
        this.estimatedAge = estimatedAge;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Genus getGenus() {
        return genus;
    }

    public void setGenus(Genus genus) {
        this.genus = genus;
    }
}