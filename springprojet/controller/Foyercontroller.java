package tn.esprit.se.springprojet.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.se.springprojet.service.IFoyerservice;

@RestController
@AllArgsConstructor
public class Foyercontroller {
    IFoyerservice foyerservice;
}
