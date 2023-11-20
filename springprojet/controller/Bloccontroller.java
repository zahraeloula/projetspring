package tn.esprit.se.springprojet.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.se.springprojet.Entities.Bloc;
import tn.esprit.se.springprojet.Entities.Etudiant;
import tn.esprit.se.springprojet.Entities.Universite;
import tn.esprit.se.springprojet.service.IBlocservice;

import java.util.List;
@RequestMapping("/bloc")
@RestController
@AllArgsConstructor
public class Bloccontroller {
    IBlocservice blocservice;

    @GetMapping("/retrieve-all-blocs")
    public List<Bloc> getBlocs() {
        List<Bloc> listBlocs = blocservice.retrieveAllBlocs();
        return listBlocs;
    }
    @GetMapping("/retrieve-bloc/{bloc-id}")
    public Bloc retrieveBloc(@PathVariable("bloc-id") Long blocId) {
        return blocservice.retrieveBloc(blocId);
    }
    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc b) {
        Bloc bloc = blocservice.addBloc(b);
        return bloc;
    }
    @DeleteMapping("/remove-bloc/{bloc-id}")
    public void removeBloc(@PathVariable("bloc-id") Long blocId) {
        blocservice.removeBloc(blocId);
    }

    @PutMapping("/update-bloc")
    public Bloc updateBloc(@RequestBody Bloc b) {
        Bloc bloc= blocservice.updateBloc(b);
        return bloc;
    }
    @PutMapping("/affecter/{nomBloc}")
    @ResponseBody
    public Bloc affecterChambresABloc(@RequestBody List<Long> numerochambre, @PathVariable("nomBloc") String nomBloc) {
        Bloc bloc = blocservice.affecterChambresABloc(numerochambre, nomBloc);
        return bloc;


    }
    }








