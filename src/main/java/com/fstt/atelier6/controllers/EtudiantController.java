package com.fstt.atelier6.controllers;


import com.fstt.atelier6.services.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.fstt.atelier6.entities.Etudiant;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EtudiantController {


    @Autowired
    private EtudiantService service;

    @GetMapping("/etudiants")
    public String list(Model model){
        model.addAttribute("etudiants",service.getAllStudents());
        return "etudiant";
    }

    @PostMapping("/etudiants/add")
    @ResponseBody
    public String addEtudiant(@RequestParam String nom, @RequestParam String prenom) {
        Etudiant etudiant = new Etudiant();
        etudiant.setNom(nom);
        etudiant.setPrenom(prenom);
        service.AddStudent(etudiant);
        return "success";
    }


}
