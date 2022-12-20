
package com.example.springbootbackend.controllers;

import com.example.springbootbackend.exceptions.RessourceNotFoundException;
import com.example.springbootbackend.models.VAssuranceAvion;
import com.example.springbootbackend.repository.VAssuranceAvionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/VAssuranceAvion")
public class VAssuranceAvionController {
    @Autowired
    private VAssuranceAvionRepository vAssuranceAvionRepository;

    @GetMapping
    public List<VAssuranceAvion> getAllVAssuranceAvions() {
        return vAssuranceAvionRepository.findAll();
    }

    //    build get vAssuranceAvion by fin assurance REST API
    @GetMapping("{nbMois}")
    public List<VAssuranceAvion> getAvionByAssurance(@PathVariable int nbMois) {
        List<VAssuranceAvion> vAssuranceAvion = vAssuranceAvionRepository.findAll();
        Date dateFin = new Date(new java.util.Date().getTime());
        dateFin.setMonth(dateFin.getMonth()+nbMois);
        List<VAssuranceAvion> reponse = new ArrayList<>();
        for (int i = 0; i < vAssuranceAvion.size(); i++) {
            if (vAssuranceAvion.get(i).getDateFin().before(dateFin) || vAssuranceAvion.get(i).getDateFin().equals(dateFin)) {
                reponse.add(vAssuranceAvion.get(i));
            }
        }
        return reponse;
    }


}


