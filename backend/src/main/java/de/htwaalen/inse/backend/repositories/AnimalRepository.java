package de.htwaalen.inse.backend.repositories;

/*
  Repository für die Tiere (Animal).
  Speichert und lädt die beobachteten Tiere aus der Datenbank.
  Die Methoden zum Speichern, Laden und Löschen kommen von JpaRepository.
 */

import org.springframework.data.jpa.repository.JpaRepository;
import de.htwaalen.inse.backend.entities.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
