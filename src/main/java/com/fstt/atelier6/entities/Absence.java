package com.fstt.atelier6.entities;


import jakarta.persistence.*;
import com.fstt.atelier6.entities.Etudiant;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
public class Absence {



    @Id @GeneratedValue
    private Long id;

    private LocalDate dateAbsence;

    private boolean justificated;

    @ManyToOne
    private Etudiant etudiant;
}
