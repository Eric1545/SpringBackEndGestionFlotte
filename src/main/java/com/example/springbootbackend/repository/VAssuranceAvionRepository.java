package com.example.springbootbackend.repository;

import com.example.springbootbackend.models.Avion;
import com.example.springbootbackend.models.VAssuranceAvion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VAssuranceAvionRepository extends JpaRepository<VAssuranceAvion, Long> {
}
