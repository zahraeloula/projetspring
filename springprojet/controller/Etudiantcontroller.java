package tn.esprit.se.springprojet.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.se.springprojet.Entities.Etudiant;
import tn.esprit.se.springprojet.service.Etudiantservice;
import tn.esprit.se.springprojet.service.IEtudiantservice;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")

public class Etudiantcontroller {

    IEtudiantservice etudiantservice ;

    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getEtudiants(){
     List<Etudiant> listEtudiants= etudiantservice.retrieveAllEtudiants();
        return listEtudiants;
    }
    // http://localhost:8080/foyer/etudiant/retrieve-etudiant/8
    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant retrieveEtudiant(@PathVariable("etudiant-id") Long idEtudiant) {
        return etudiantservice.retrieveEtudiant(idEtudiant);
    }
    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantservice.addEtudiant(e);
        return etudiant;
    }
    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Long etudiantId) {
        etudiantservice.removeEtudiant(etudiantId);
    }
    @PutMapping("/update-etudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant= etudiantservice.updateEtudiant(e);
        return etudiant;
    }



}
