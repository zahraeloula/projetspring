package tn.esprit.se.springprojet.Entities;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table( name = "foyer")
public class foyer  implements Serializable {
    @Id
    Long idfoyer;
    String nomfoyer;
    Long capaciteFoyer;

}
