package com.example.springbootbackend.repository;

import com.example.springbootbackend.models.Avion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvionRepository extends JpaRepository<Avion, Long> {
}
