package tn.esprit.se.springprojet.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springprojet.Entities.Etudiant;
import tn.esprit.se.springprojet.repositories.Etudiantrepisotories;
import java.util.List;
@Slf4j
@Service
@AllArgsConstructor
public class Etudiantservice implements IEtudiantservice{

    Etudiantrepisotories etudiantrepisotories ;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return (List<Etudiant>) etudiantrepisotories.findAll();    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantrepisotories.save(e) ;
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantrepisotories.save(e) ;
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return etudiantrepisotories.findById(idEtudiant).get();
    }

    @Override
    public void removeEtudiant(Long idEtudiant) {
etudiantrepisotories.deleteById(idEtudiant);
    }
}
