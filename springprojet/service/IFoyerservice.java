package tn.esprit.se.springprojet.service;

import tn.esprit.se.springprojet.Entities.Foyer;

import java.util.List;

public interface IFoyerservice {
    List<Foyer> retrieveAllFoyers();

    Foyer addFoyer(Foyer f);

    Foyer updateFoyer(Foyer f);

    Foyer retrieveFoyer(Long idfoyer);

    void removeFoyer(Long idfoyer);

    Foyer addFoyerWithBloc(Foyer f);
}
