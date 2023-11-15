package tn.esprit.se.springprojet.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springprojet.Entities.Etudiant;
import tn.esprit.se.springprojet.Entities.Foyer;
import tn.esprit.se.springprojet.repositories.Foyerrepositories;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class Foyerservice implements IFoyerservice {
    Foyerrepositories foyerrepositories ;
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return (List<Foyer>) foyerrepositories.findAll();    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerrepositories.save(f) ;
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerrepositories.save(f) ;
    }

    @Override
    public Foyer retrieveFoyer(Long idFoyer) {
        return foyerrepositories.findById(idFoyer).get();
    }

    @Override
    public void removeFoyer(Long idFoyer) {
        foyerrepositories.deleteById(idFoyer);
    }
}


