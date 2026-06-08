package de.htwaalen.inse.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import de.htwaalen.inse.backend.entities.Genus;

// JpaRepository nimmt 2 Werte: <Die Klasse um die es geht, Der Datentyp der ID>
public interface GenusRepository extends JpaRepository<Genus, Long> {
}