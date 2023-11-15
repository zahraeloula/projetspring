package tn.esprit.se.springprojet.service;

import tn.esprit.se.springprojet.Entities.Reservation;

import java.util.List;

public interface IReservationservice {
    List<Reservation> retrieveAllReservations();

    Reservation addReservation(Reservation r);

    Reservation updateReservation(Reservation r);

    Reservation retrieveReservation(Long idReservation);

    void removeReservation(Long idReservation);
}

