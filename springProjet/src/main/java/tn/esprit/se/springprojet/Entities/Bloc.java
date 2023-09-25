package tn.esprit.se.springprojet.Entities;

import jakarta.persistence.*;

import java.io.Serializable;
    @Entity
    @Table( name = "Bloc")
    public class Bloc  {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="idBloc")
        private long idBloc;
        private String nomBloc;
        private long capaciteBloc;

    }

