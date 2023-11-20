package tn.esprit.se.springprojet.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.se.springprojet.Entities.Foyer;
import tn.esprit.se.springprojet.service.Foyerservice;
import tn.esprit.se.springprojet.service.IFoyerservice;

import java.util.List;

@RestController
@AllArgsConstructor
public class Foyercontroller {
    IFoyerservice foyerservice;
    // http://localhost:8089/foyer/reservation/retrieve-all-foyers
    @GetMapping("/retrieve-all-Foyers")
    public List<Foyer> getFoyers() {
        List<Foyer> listFoyers = foyerservice.retrieveAllFoyers();
        return listFoyers;
    }// http://localhost:8089/foyer/reservation/retrieve-reservation/8
    @GetMapping("/retrieve-foyer/{foyer-id}")
    public Foyer retrieveFoyer(@PathVariable("foyer-id") Long foyerId) {
        return foyerservice.retrieveFoyer(foyerId);
    }
    @PostMapping("/add-foyer")
    public Foyer addFoyer(@RequestBody Foyer f) {
        Foyer foyer = foyerservice.addFoyer(f);
        return foyer;
    }
    @DeleteMapping("/remove-foyer/{foyer-id}")
    public void removeFoyer(@PathVariable("foyer-id") Long foyerId) {

        foyerservice.removeFoyer(foyerId);
    }
    @PutMapping("/update-foyer")
    public Foyer updateFoyer(@RequestBody Foyer f) {
        Foyer foyer= foyerservice.updateFoyer(f);
        return foyer;
    }

    @PostMapping("/add-FoyerWithBloc")
    @ResponseBody
    public Foyer addFoyerWithBloc(@RequestBody Foyer f) {
        Foyer foyer = foyerservice.addFoyerWithBloc(f);
        return foyer;
    }
}
