package tn.esprit.se.springprojet.service;

import tn.esprit.se.springprojet.Entities.Bloc;
import tn.esprit.se.springprojet.Entities.Chambre;
import tn.esprit.se.springprojet.Entities.TypeC;

import java.util.List;
import java.util.Set;

public interface Ichambreservice {
    List<Chambre> retrieveAllChambres();

    Chambre addChambre(Chambre c);

    Chambre updateChambre(Chambre c);

    Chambre retrieveChambre(Long idchambre);

    void removeChambre(Long idchambre);

    Set<Chambre> getChambresParNomBloc(String nomBloc);

    long nbChambreParTypeEtBloc(TypeC typechambre, Long idBloc);
}





