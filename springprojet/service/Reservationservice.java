package tn.esprit.se.springprojet.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springprojet.Entities.Reservation;
import tn.esprit.se.springprojet.repositories.Etudiantrepisotories;
import tn.esprit.se.springprojet.repositories.Reservationrepositories;

import java.util.List;

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
    public Reservation retrieveReservation(Long idReservation) {
        return reservationrepositories.findById(idReservation).get();}

    @Override
    public  void removeReservation(Long idReservation) {
        reservationrepositories.deleteById(idReservation);}
}


