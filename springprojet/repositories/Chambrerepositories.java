package tn.esprit.se.springprojet.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.se.springprojet.Entities.Chambre;
import tn.esprit.se.springprojet.Entities.Etudiant;

public interface Chambrerepositories extends CrudRepository<Chambre,Long> {
}
