package tn.esprit.se.springprojet.service;

import tn.esprit.se.springprojet.Entities.Bloc;
import tn.esprit.se.springprojet.Entities.Chambre;

import java.util.List;

public interface Ichambreservice {
    List<Chambre> retrieveAllChambres();

    Chambre addChambre(Chambre c);

    Chambre updateChambre(Chambre c);

    Chambre retrieveChambre(Long idchambre);

    void removeChambre(Long idchambre);
}





