package tn.esprit.se.springprojet.Entities;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
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
