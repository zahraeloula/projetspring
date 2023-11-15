package tn.esprit.se.springprojet.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.se.springprojet.Entities.Chambre;

import java.util.List;

public interface Chambrerepositories extends CrudRepository<Chambre,Long> {
    Chambre findBynumerochambre (Long numerochambre);

}
