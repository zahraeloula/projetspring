package tn.esprit.se.springprojet.Entities;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
@Entity
@Table( name = "chambre")
public class chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idchambre")
    private long idchambre;
    private long numerochambre;
    private typeC typechambre;
}
