package tn.esprit.se.springprojet.service;

import tn.esprit.se.springprojet.Entities.Reservation;

import java.util.Date;
import java.util.List;
import java.util.Set;

public interface IReservationservice {
    List<Reservation> retrieveAllReservations();

    Reservation addReservation(Reservation r);

    Reservation updateReservation(Reservation r);

    Reservation retrieveReservation(String idReservation);

    void removeReservation(String idReservation);

    Set<Reservation> getReservationParAnneeUniversitaire(Date dateDebut, Date dateFin);
}

