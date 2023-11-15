package tn.esprit.se.springprojet.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springprojet.Entities.Foyer;
import tn.esprit.se.springprojet.Entities.Universite;
import tn.esprit.se.springprojet.repositories.Foyerrepositories;
import tn.esprit.se.springprojet.repositories.Universiterepositories;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class Universiteservice implements IUniversiteservice {
    Universiterepositories universiterepositories;
    Foyerrepositories foyerrepositories;

    @Override
    public List<Universite> retrieveAllUniversites() {
        return (List<Universite>) universiterepositories.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return (Universite) universiterepositories.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiterepositories.save(u);
    }


    @Override
    public Universite retrieveUniversite(Long idUniversite) {
        return universiterepositories.findById(idUniversite).get();
    }

    @Override
    public void removeUniversite(Long idUniversite) {
        universiterepositories.deleteById(idUniversite);
    }


    public Universite affecterFoyerAUniversite(long idFoyer, String nomuniversite) {
        Foyer foyer = foyerrepositories.findById(idFoyer).get();
        Universite universite  = universiterepositories.findByNomUniversite(nomuniversite);
        universite.setFoyer(foyer);
        universiterepositories.save(universite);
        return universite;
    }
    public Universite desaffecterFoyerAUniversite(long idUniversite) {
        Universite universite  = universiterepositories.findById(idUniversite).get();
        universite.setFoyer(null);
        universiterepositories.save(universite);
        return universite;
    }

}





