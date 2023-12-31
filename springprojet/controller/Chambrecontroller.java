package tn.esprit.se.springprojet.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.se.springprojet.Entities.Bloc;
import tn.esprit.se.springprojet.Entities.Chambre;
import tn.esprit.se.springprojet.Entities.TypeC;
import tn.esprit.se.springprojet.service.IBlocservice;
import tn.esprit.se.springprojet.service.Ichambreservice;

import java.util.List;
import java.util.Set;

@RequestMapping("/chambre")
@RestController
@AllArgsConstructor
public class Chambrecontroller {
    Ichambreservice chambreservice;

    @GetMapping("/retrieve-all-chambres")
    public List<Chambre> getChambres() {
        List<Chambre> chambreList = chambreservice.retrieveAllChambres();
        return chambreList;
    }

    @GetMapping("/retrieve-etudiant/{chambre-id}")
    public Chambre retrieveChambre(@PathVariable("chambre-id") Long chambreId) {
        return chambreservice.retrieveChambre(chambreId);
    }

    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreservice.addChambre(c);
        return chambre;
    }

    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeChambre(@PathVariable("chambre-id") Long idchambre) {
        chambreservice.removeChambre(idchambre);
    }

    @PutMapping("/update-chambre")
    public Chambre updateChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreservice.updateChambre(c);
        return chambre;
    }

    @GetMapping("/getChambresParNomBloc/{nomBloc}")
    public Set<Chambre> getChambresParNomBloc(@PathVariable String nomBloc) {
        Set<Chambre> chambres = chambreservice.getChambresParNomBloc(nomBloc);
        return chambres;
    }
    @GetMapping("/nbChambreParTypeEtBloc/{TypeChambre}/{idBloc}")
    public long nbChambreParTypeEtBloc(@PathVariable  ("TypeChambre") TypeC typechambre, @PathVariable("idBloc") Long idBloc){

        return chambreservice.nbChambreParTypeEtBloc(typechambre, idBloc);

    }}



