package tn.esprit.se.springprojet.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.se.springprojet.Entities.Etudiant;
import tn.esprit.se.springprojet.Entities.Reservation;
import tn.esprit.se.springprojet.service.IReservationservice;

import java.util.List;

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
    public  Reservation retrieveReservation(@PathVariable("reservation-id") Long idreservation) {
        return reservationservice.retrieveReservation(idreservation);
    }
    @PostMapping("/add-reservation")
    public  Reservation addReservation(@RequestBody Reservation r) {
        Reservation reservation = reservationservice.addReservation(r);
        return reservation;
    }
    @DeleteMapping("/remove-reservation/{reservation-id}")
    public void removeEtudiant(@PathVariable("reservation-id") Long reservationId) {
        reservationservice.removeReservation(reservationId);
    }
    @PutMapping("/update-reservation")
    public Reservation updateReservation(@RequestBody Reservation r) {
        Reservation reservation= reservationservice.updateReservation(r);
        return reservation;
    }
}
