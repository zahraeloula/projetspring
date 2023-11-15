package tn.esprit.se.springprojet.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.se.springprojet.Entities.Reservation;
import tn.esprit.se.springprojet.Entities.Universite;
import tn.esprit.se.springprojet.service.IUniversiteservice;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class Universitecontroller {
    IUniversiteservice universiteservice ;
    @GetMapping("/retrieve-all-universites")
    public List<Universite> getUniversites(){
        List<Universite> listuniversites= universiteservice.retrieveAllUniversites();
        return listuniversites;
    }

    @GetMapping("/retrieve-universite/{universite-id}")
    public  Universite retrieveUniversite(@PathVariable("universite-id") Long iduniversite) {
        return universiteservice.retrieveUniversite(iduniversite);
    }
    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite u) {
        Universite universite= universiteservice.addUniversite(u);
        return universite;
    }
    @DeleteMapping("/remove-universite/{universite-id}")
    public void removeUniversite(@PathVariable("universite-id") Long universiteId) {
        universiteservice.removeUniversite(universiteId);
    }
    @PutMapping("/update-universite")
    public Universite updateUniversite(@RequestBody Universite u) {
        Universite universite= universiteservice.updateUniversite(u);
        return universite;
    }

    @PutMapping("/affecter/{nomUniversite}/{idFoyer}")
    @ResponseBody
    public Universite affecterFoyerAUniversite(@PathVariable("nomUniversite") String nomUniversite, @PathVariable("idFoyer") long idFoyer){
        Universite universite = universiteservice.affecterFoyerAUniversite(idFoyer,nomUniversite);
        return universite;
    }

    @PutMapping("/desaffecter/{idUniversite}")
    @ResponseBody
    public Universite desaffecterFoyerAUniversite(@PathVariable("idUniversite") long idUniversite){
        Universite universite = universiteservice.desaffecterFoyerAUniversite(idUniversite);
        return universite;
    }





}
