package de.htwaalen.inse.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import de.htwaalen.inse.backend.entities.Observation;

public interface ObservationRepository extends JpaRepository<Observation, Long> {
}