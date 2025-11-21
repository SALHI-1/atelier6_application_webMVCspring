package com.fstt.atelier6.repositories;

import com.fstt.atelier6.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {}

