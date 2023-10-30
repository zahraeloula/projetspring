package tn.esprit.se.springprojet.service;

import tn.esprit.se.springprojet.Entities.Bloc;
import tn.esprit.se.springprojet.Entities.Etudiant;

import java.util.List;

public interface IBlocservice {
    List<Bloc> retrieveAllBlocs();

     Bloc addBloc(Bloc b);

    Bloc updateBloc(Bloc b);

    Bloc retrieveBloc(Long idBloc);

    void removeBloc(Long idBloc);
}

