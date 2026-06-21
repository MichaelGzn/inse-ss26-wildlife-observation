package de.htwaalen.inse.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import de.htwaalen.inse.backend.entities.Genus;

// JpaRepository nimmt 2 Werte: <Die Klasse um die es geht, Der Datentyp der ID>
/*
 Repository für die Gattungen (Genus).
 Hier werden die Tierarten in der Datenbank verwaltet.
 Die Standard-Methoden kommen von JpaRepository.
 */
public interface GenusRepository extends JpaRepository<Genus, Long> {
}
