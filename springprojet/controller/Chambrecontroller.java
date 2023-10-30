package tn.esprit.se.springprojet.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.se.springprojet.Entities.Bloc;
import tn.esprit.se.springprojet.Entities.Chambre;
import tn.esprit.se.springprojet.service.IBlocservice;
import tn.esprit.se.springprojet.service.Ichambreservice;

import java.util.List;
@RequestMapping("/chambre")
@RestController
@AllArgsConstructor
public class Chambrecontroller {
    Ichambreservice chambreservice;
    @GetMapping("/retrieve-all-chambres")
    public List<Chambre> getChambres() {
        List<Chambre> chambreList = chambreservice.retrieveAllChambres();
        return chambreList;
    }}



