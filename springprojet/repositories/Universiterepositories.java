package tn.esprit.se.springprojet.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.se.springprojet.Entities.Bloc;
import tn.esprit.se.springprojet.Entities.Foyer;
import tn.esprit.se.springprojet.Entities.Universite;

public interface Universiterepositories extends CrudRepository<Universite, Long> {
    Universite findByNomUniversite(String nomUniversite);
}
