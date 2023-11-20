package tn.esprit.se.springprojet.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springprojet.Entities.Bloc;
import tn.esprit.se.springprojet.Entities.Etudiant;
import tn.esprit.se.springprojet.Entities.Foyer;
import tn.esprit.se.springprojet.repositories.Blocrepositories;
import tn.esprit.se.springprojet.repositories.Foyerrepositories;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class Foyerservice implements IFoyerservice {
    Foyerrepositories foyerrepositories ;
    Blocrepositories blocrepositories;
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
    public Foyer addFoyerWithBloc (Foyer foyer){
        Foyer f = foyerrepositories.save(foyer);
        return (f);


    }
}


