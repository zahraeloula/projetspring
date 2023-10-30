package tn.esprit.se.springprojet.Entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
 @Setter
@Builder
@FieldDefaults(level=AccessLevel.PRIVATE)
@Table( name = "Etudiant")
public class Etudiant implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
     Long idEtudiant; // Clé primaire
      String nomEt;
      String prenomEt;
      Long cin;
     String ecole;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;


// Constructeur et accesseurs (getters) et mutateurs (setters)
}
