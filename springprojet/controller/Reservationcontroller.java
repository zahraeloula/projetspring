package tn.esprit.se.springprojet.controller;

import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.se.springprojet.Entities.Etudiant;
import tn.esprit.se.springprojet.Entities.Reservation;
import tn.esprit.se.springprojet.service.IReservationservice;

import java.util.Date;
import java.util.List;
import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class Reservationcontroller {
    IReservationservice reservationservice ;
    @GetMapping("/retrieve-all-reservations")
    public List<Reservation> getReservations(){
        List<Reservation> listreservations= reservationservice.retrieveAllReservations();
        return listreservations;
    }
    // http://localhost:8080/foyer/etudiant/retrieve-etudiant/8
    @GetMapping("/retrieve-reservation/{reservation-id}")
    public  Reservation retrieveReservation(@PathVariable("reservation-id") String idreservation) {
        return reservationservice.retrieveReservation(idreservation);
    }
    @PostMapping("/add-reservation")
    public  Reservation addReservation(@RequestBody Reservation r) {
        Reservation reservation = reservationservice.addReservation(r);
        return reservation;
    }
    @DeleteMapping("/remove-reservation/{reservation-id}")
    public void removeEtudiant(@PathVariable("reservation-id") String reservationId) {
        reservationservice.removeReservation(reservationId);
    }
    @PutMapping("/update-reservation")
    public Reservation updateReservation(@RequestBody Reservation r) {
        Reservation reservation= reservationservice.updateReservation(r);
        return reservation;
    }
    @GetMapping("/getReservationParAnneeUniversitaire/{dateDebut}/{dateFin}")
    public Set<Reservation> getReservationParAnneeUniversitaire(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateDebut, @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateFin) {
        Set<Reservation> reservation = reservationservice.getReservationParAnneeUniversitaire(dateDebut,dateFin);
        return reservation;
    }
}
