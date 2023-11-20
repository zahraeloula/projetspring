package tn.esprit.se.springprojet.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springprojet.Entities.Reservation;
import tn.esprit.se.springprojet.repositories.Etudiantrepisotories;
import tn.esprit.se.springprojet.repositories.Reservationrepositories;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Slf4j
@Service
@AllArgsConstructor
public class Reservationservice implements IReservationservice {
    Reservationrepositories reservationrepositories ;

    @Override
    public List<Reservation> retrieveAllReservations() {
        return (List<Reservation>) reservationrepositories.findAll();}

    @Override
    public  Reservation addReservation(Reservation r) {
        return (Reservation) reservationrepositories.save(r);}

    @Override
    public  Reservation updateReservation(Reservation r) {
        return reservationrepositories.save(r);
    }


    @Override
    public Reservation retrieveReservation(String idReservation) {
        return reservationrepositories.findById(idReservation).get();}

    @Override
    public  void removeReservation(String idReservation) {
        reservationrepositories.deleteById(idReservation);}

    public Set<Reservation> getReservationParAnneeUniversitaire(Date dateDebut , Date dateFin ){
        Set<Reservation> reservation =reservationrepositories.findByAnneeUniversitaireBetween(dateDebut,dateFin );

        return reservation;

    }
}


