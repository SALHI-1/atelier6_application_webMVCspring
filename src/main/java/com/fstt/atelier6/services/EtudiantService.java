package com.fstt.atelier6.services;

import com.fstt.atelier6.entities.Etudiant;
import com.fstt.atelier6.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService {
    @Autowired
    private EtudiantRepository repo;

    public void AddStudent(Etudiant e){
        repo.save(e);
    }

    public List<Etudiant> getAllStudents() {
        return repo.findAll();
    }

    public Etudiant getStudent(Long id){
        return repo.findById(id)
                .orElse(null); // ou orElseThrow()
    }

}
