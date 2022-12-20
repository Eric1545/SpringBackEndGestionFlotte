package com.example.springbootbackend.controllers;

import com.example.springbootbackend.exceptions.RessourceNotFoundException;
import com.example.springbootbackend.models.VAssuranceAvion;
import com.example.springbootbackend.models.VKilometrageAvion;
import com.example.springbootbackend.repository.VKilometrageAvionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/details")
public class VKilometrageAvionController {
    @Autowired
    private VKilometrageAvionRepository vKilometrageAvion;

    @GetMapping
    public List<VKilometrageAvion> getAllVKilometrageAvions() {
        return vKilometrageAvion.findAll();
    }

    @GetMapping("{idAvion}")
    public List<VKilometrageAvion> getVKilometrageAvionById(@PathVariable long idAvion) {
        List<VKilometrageAvion> vKilometrageAvions = vKilometrageAvion.findAll();
        List<VKilometrageAvion> reponse = new ArrayList<>();
        for (int i = 0; i < vKilometrageAvions.size(); i++) {
            if (vKilometrageAvions.get(i).getIdAvion() == idAvion) {
                reponse.add(vKilometrageAvions.get(i));
            }
        }
        return reponse;
    }
}
