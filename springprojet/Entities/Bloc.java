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
    private Set<Chambre> chambres;
}

