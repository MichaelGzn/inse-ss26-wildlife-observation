package de.htwaalen.inse.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import de.htwaalen.inse.backend.entities.Animal;

/*
  Repository für die Tiere (Animal).
  Speichert und lädt die beobachteten Tiere aus der Datenbank.
  Die Methoden zum Speichern, Laden und Löschen kommen von JpaRepository.
 */

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
