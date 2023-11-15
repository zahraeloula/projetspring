package tn.esprit.se.springprojet.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.se.springprojet.Entities.Bloc;
import tn.esprit.se.springprojet.Entities.Universite;

import javax.swing.*;
import java.sql.ClientInfoStatus;
import java.util.List;

public interface Blocrepositories extends CrudRepository<Bloc, Long> {
    List<Bloc> findByFoyerUniversiteIdUniversite (long idU);
  Bloc findBynomBloc (String nomBloc);

}
