package de.htwaalen.inse.backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//Genus wird als Tabelle in der Datenbank angelegt 
@Entity
public class Genus {

  // EIndeutige ID für jede Gattung
  @Id
  // Die ID wird automatisch erstellt
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  // Name der Gattung
  private String designation;

  // Wissenschaftlicher (Lateinischer) Name der Gattung
  private String latinDesignation;

  // Getter und Setter

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