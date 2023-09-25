package tn.esprit.se.springprojet.Entities;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table( name = "Reservation")

public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idReservation")
    private Long idReservation; //
    private Date anneeUniversitaire ;
    private boolean estValide;
}