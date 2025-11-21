package com.fstt.atelier6.services;

/*
import com.fstt.atelier6.entities.Etudiant;
*/
import com.fstt.atelier6.entities.Absence;
import com.fstt.atelier6.repositories.AbsenceRepository;
import com.fstt.atelier6.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbsenceService {
    @Autowired
    private AbsenceRepository repo;

    public void AddAbsence(Absence a){
        repo.save(a);
    }

    public List<Absence> getAbsences(Long id){
        return repo.findByEtudiantId(id);
    }


}
