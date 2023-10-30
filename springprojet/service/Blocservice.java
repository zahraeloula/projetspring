package tn.esprit.se.springprojet.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springprojet.Entities.Bloc;
import tn.esprit.se.springprojet.Entities.Etudiant;
import tn.esprit.se.springprojet.repositories.Blocrepositories;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class Blocservice implements IBlocservice {
    Blocrepositories blocrepositories;

    @Override
    public List<Bloc> retrieveAllBlocs() {
        return (List<Bloc>) blocrepositories.findAll();    }

    @Override
    public Bloc addBloc (Bloc b) {
        return blocrepositories.save(b) ;
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocrepositories.save(b) ;
    }

    @Override
    public Bloc retrieveBloc(Long idBloc) {
        return blocrepositories.findById(idBloc).get();
    }

    @Override
    public void removeBloc(Long idBloc) {
        blocrepositories.deleteById(idBloc);
    }
}




