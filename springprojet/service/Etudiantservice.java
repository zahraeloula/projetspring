package tn.esprit.se.springprojet.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springprojet.Entities.Etudiant;
import tn.esprit.se.springprojet.Entities.Reservation;
import tn.esprit.se.springprojet.repositories.Etudiantrepisotories;
import tn.esprit.se.springprojet.repositories.Reservationrepositories;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Slf4j
@Service
@AllArgsConstructor
public class Etudiantservice implements IEtudiantservice {

    Etudiantrepisotories etudiantrepisotories;
    Reservationrepositories reservationrepositories;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return (List<Etudiant>) etudiantrepisotories.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantrepisotories.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantrepisotories.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return etudiantrepisotories.findById(idEtudiant).get();
    }

    @Override
    public void removeEtudiant(Long idEtudiant) {
        etudiantrepisotories.deleteById(idEtudiant);
    }


    public Etudiant affecterEtudiantAReservation(String nomEt, String prenomEt, String idReservation) {
        Reservation reservation = reservationrepositories.findById(idReservation).get();
        Etudiant etudiant = etudiantrepisotories.findByNomEtAndPrenomEt(nomEt, prenomEt);
        Set<Reservation> reservationMiseajour = new HashSet<>();
        if (etudiant.getReservations() != null) {
            reservationMiseajour = etudiant.getReservations();
        }
        reservationMiseajour.add(reservation);
        etudiant.setReservations(reservationMiseajour);
        etudiantrepisotories.save(etudiant);
        return etudiant;
    }

}