package tn.esprit.se.springprojet.Entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
    @Table( name = "Bloc")
    public class Bloc  {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="idBloc")
        private long idBloc;
        private String nomBloc;
        private long capaciteBloc;
@ManyToOne
Foyer foyer;
    @OneToMany
            (cascade = CascadeType.ALL, mappedBy = "bloc")
    private Set<Chambre> chambres;
}

