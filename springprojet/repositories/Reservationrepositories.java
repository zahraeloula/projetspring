package tn.esprit.se.springprojet.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.se.springprojet.Entities.Bloc;
import tn.esprit.se.springprojet.Entities.Reservation;

import java.util.Date;
import java.util.Set;

public interface Reservationrepositories extends CrudRepository<Reservation, String> {
    Set<Reservation> findByAnneeUniversitaireBetween(Date dateDebut, Date dateFin);
}
