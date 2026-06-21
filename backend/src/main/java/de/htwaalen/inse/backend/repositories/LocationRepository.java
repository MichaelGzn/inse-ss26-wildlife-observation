package de.htwaalen.inse.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import de.htwaalen.inse.backend.entities.Location;

/*
 Repository für die Orte (Location).
 Speichert die Beobachtungsorte samt Koordinaten für die Karte.
 Speichern, Laden und Löschen übernimmt JpaRepository.
 */

public interface LocationRepository extends JpaRepository<Location, Long> {
}
