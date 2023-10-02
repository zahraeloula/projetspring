package tn.esprit.se.springprojet.Entities;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table( name = "chambre")
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idchambre")
    private long idchambre;
    private long numerochambre;
    @Enumerated (EnumType.STRING)
    private TypeC typechambre;
    @ManyToOne
    Bloc bloc ;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;
}
