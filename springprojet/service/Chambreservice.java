package tn.esprit.se.springprojet.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springprojet.Entities.Bloc;
import tn.esprit.se.springprojet.Entities.Chambre;
import tn.esprit.se.springprojet.repositories.Blocrepositories;
import tn.esprit.se.springprojet.repositories.Chambrerepositories;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class Chambreservice implements Ichambreservice {
       Chambrerepositories chambrerepositories ;
    @Override
    public List<Chambre> retrieveAllChambres() {
        return (List<Chambre>) chambrerepositories.findAll();
    }

    @Override
    public Chambre addChambre (Chambre c) {
        return chambrerepositories.save(c) ;
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambrerepositories.save(c) ;
    }

    @Override
    public Chambre retrieveChambre(Long idchambre) {
        return chambrerepositories.findById(idchambre).get();

    }

    @Override
    public void removeChambre(Long idchambre) {
        chambrerepositories.deleteById(idchambre);
    }
}








