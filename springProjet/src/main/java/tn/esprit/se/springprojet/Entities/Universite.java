package tn.esprit.se.springprojet.Entities;
import jakarta.persistence.*;

@Entity
@Table( name = "Universite")
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idUniversite;
    String nomUniversite;
    String adresse;
@OneToOne
private Foyer foyer;
}