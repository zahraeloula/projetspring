package tn.esprit.se.springprojet.service;

import tn.esprit.se.springprojet.Entities.Etudiant;

import java.util.List;

public interface IEtudiantservice {
    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant(Etudiant e);

    Etudiant updateEtudiant(Etudiant e);

    Etudiant retrieveEtudiant(Long idEtudiant);

    void removeEtudiant(Long idEtudiant);
}

