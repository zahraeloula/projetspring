package tn.esprit.se.springprojet.Entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Builder
@FieldDefaults(level=AccessLevel.PRIVATE)


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
