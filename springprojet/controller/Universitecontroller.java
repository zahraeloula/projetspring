package tn.esprit.se.springprojet.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.se.springprojet.service.IUniversiteservice;

@RestController
@AllArgsConstructor
public class Universitecontroller {
    IUniversiteservice universiteservice ;
}
