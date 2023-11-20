package tn.esprit.se.springprojet.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.se.springprojet.Entities.Chambre;
import tn.esprit.se.springprojet.Entities.TypeC;

import java.util.List;
import java.util.Set;

public interface Chambrerepositories extends CrudRepository<Chambre,Long> {
    Chambre findBynumerochambre (Long numerochambre);
    Set<Chambre> findByTypeChambreAndBlocIdBloc(TypeC typechambre, Long idBloc);

}
