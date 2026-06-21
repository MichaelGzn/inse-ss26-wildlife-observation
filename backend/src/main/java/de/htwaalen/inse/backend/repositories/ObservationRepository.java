package de.htwaalen.inse.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import de.htwaalen.inse.backend.entities.Observation;

/*
 Repository für die Beobachtungen (Observation).
 Verbindet ein Tier mit einem Ort und merkt sich Datum und Uhrzeit.
 Die CRUD-Methoden kommen von JpaRepository.
 */

public interface ObservationRepository extends JpaRepository<Observation, Long> {
}
