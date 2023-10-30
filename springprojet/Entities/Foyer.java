package tn.esprit.se.springprojet.Entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Builder
@FieldDefaults(level=AccessLevel.PRIVATE)
@Table( name = "foyer")
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idfoyer;
    String nomfoyer;
    Long capaciteFoyer;
@OneToOne (mappedBy = "foyer")
    private Universite Universite;

@OneToMany(cascade = CascadeType.ALL, mappedBy="foyer")
private Set<Bloc> blocs;

}
