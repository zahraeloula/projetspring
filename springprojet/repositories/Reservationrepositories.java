package tn.esprit.se.springprojet.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.se.springprojet.Entities.Bloc;
import tn.esprit.se.springprojet.Entities.Reservation;

public interface Reservationrepositories extends CrudRepository<Reservation, Long> {
}
