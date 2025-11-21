package com.fstt.atelier6.controllers;

import com.fstt.atelier6.entities.Absence;
import com.fstt.atelier6.entities.Etudiant;
import com.fstt.atelier6.services.AbsenceService;
import com.fstt.atelier6.services.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AbsenceController {

    @Autowired
    private AbsenceService serviceAbs;


    @GetMapping("/absences/{etudiantId}")
    public String listByStudent(@PathVariable Long etudiantId, Model model){
        model.addAttribute("absences", serviceAbs.getAbsences(etudiantId));
        return "absences";
    }
    @GetMapping("/absences/add/{etudiantId}")
    public String showAddForm(@PathVariable Long etudiantId, Model model) {
        Absence absence = new Absence();
        model.addAttribute("absence", absence);
        model.addAttribute("etudiantId", etudiantId);
        return "addAbsence"; // template Thymeleaf
    }

    @PostMapping("/absences/add/{etudiantId}")
    public String saveAbsence(@PathVariable Long etudiantId, @ModelAttribute Absence absence) {
        Etudiant etudiant = new Etudiant();
        etudiant.setId(etudiantId);

        absence.setEtudiant(etudiant);
        serviceAbs.AddAbsence(absence);
        return "redirect:/absences/" + etudiantId;
    }




}
