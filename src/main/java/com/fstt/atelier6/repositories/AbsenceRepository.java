package com.fstt.atelier6.repositories;

import com.fstt.atelier6.entities.Absence;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AbsenceRepository extends JpaRepository<Absence, Long> {

    public List<Absence> findByEtudiantId(Long etudiantId);


}

