package tn.esprit.se.springprojet.service;

import tn.esprit.se.springprojet.Entities.Universite;

import java.util.List;

public interface IUniversiteservice {
    List<Universite> retrieveAllUniversites();

    Universite addUniversite(Universite u);

    Universite updateUniversite(Universite u);

    Universite retrieveUniversite(Long idUniversite);

    void removeUniversite(Long idUniversite);
    public Universite affecterFoyerAUniversite(long idUniversite, String nomfoyer);
    public Universite desaffecterFoyerAUniversite(long idUniversite);
}


