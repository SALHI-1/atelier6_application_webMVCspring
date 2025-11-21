package com.fstt.atelier6.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

@Entity
@Getter
@Setter
public class Etudiant {
    @Id @GeneratedValue
    private Long id;
    private String nom;
    private String prenom;

    @OneToMany(mappedBy = "etudiant")
    private List<Absence> absences;
}

