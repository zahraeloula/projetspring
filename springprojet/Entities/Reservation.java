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
public class Reservation implements Serializable {
    @Id
    @Column(name="idReservation")
    String idReservation; //
    Date anneeUniversitaire ;
     boolean estValide;
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "reservations")
    private Set<Etudiant> etudiants;
}