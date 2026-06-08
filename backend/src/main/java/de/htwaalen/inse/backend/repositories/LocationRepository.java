package de.htwaalen.inse.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import de.htwaalen.inse.backend.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {
}