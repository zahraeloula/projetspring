package tn.esprit.se.springprojet.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @Table( name = "Bloc")
    public class Bloc  {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="idBloc")
         long idBloc;
         String nomBloc;
        long capaciteBloc;
@ManyToOne
Foyer foyer;
    @OneToMany
            (cascade = CascadeType.ALL, mappedBy = "bloc")
    @JsonIgnore
    private  Set<Chambre> chambres;
}

