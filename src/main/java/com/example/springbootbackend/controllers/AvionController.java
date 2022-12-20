package com.example.springbootbackend.controllers;

import com.example.springbootbackend.exceptions.RessourceNotFoundException;
import com.example.springbootbackend.models.Avion;
import com.example.springbootbackend.repository.AvionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/Avion")
public class AvionController {
    @Autowired
    private AvionRepository avionRepository;

    @GetMapping
    public List<Avion> getAllAvions() {
        return avionRepository.findAll();
    }

    //    build create avion REST API
    @PostMapping
    public Avion createAvion(@RequestBody Avion avion) {
        return avionRepository.save(avion);
    }

    //    build get avion by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Avion> getAvionById(@PathVariable long id) {
        Avion avion = avionRepository.findById(id)
                .orElseThrow(() -> new RessourceNotFoundException("Avion not exist with id: " + id));
        return ResponseEntity.ok(avion);
    }
}
