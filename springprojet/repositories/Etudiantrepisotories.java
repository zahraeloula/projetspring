package tn.esprit.se.springprojet.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.se.springprojet.Entities.Etudiant;

public interface Etudiantrepisotories extends CrudRepository<Etudiant,Long> {
  Etudiant findByNomEtAndPrenomEt(String nomEt,String prenomEt);

}
