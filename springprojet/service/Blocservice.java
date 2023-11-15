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
public class Blocservice implements IBlocservice {
    Blocrepositories blocrepositories;
    Chambrerepositories chambrerepositories;

    @Override
    public List<Bloc> retrieveAllBlocs() {
        return (List<Bloc>) blocrepositories.findAll();
    }

    @Override
    public Bloc addBloc(Bloc b) {
        return blocrepositories.save(b);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocrepositories.save(b);
    }

    @Override
    public Bloc retrieveBloc(Long idBloc) {
        return blocrepositories.findById(idBloc).get();
    }

    @Override
    public void removeBloc(Long idBloc) {
        blocrepositories.deleteById(idBloc);
    }

    @Override
    public Bloc affecterChambresABloc(List<Long> numerochambre, String nomBloc) {
        Bloc bloc = blocrepositories.findBynomBloc(nomBloc);
        for (Long Numerochambre : numerochambre) {
            Chambre chambre = chambrerepositories.findBynumerochambre(Numerochambre);
            chambre.setBloc(bloc);
            chambrerepositories.save(chambre);
        }
        return bloc;
    }



}




