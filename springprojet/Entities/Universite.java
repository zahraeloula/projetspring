package tn.esprit.se.springprojet.Entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Builder
@FieldDefaults(level=AccessLevel.PRIVATE)
@Table( name = "Universite")
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idUniversite;
    String nomUniversite;
    String adresse;
@OneToOne(cascade=CascadeType.ALL)
private Foyer foyer;

}