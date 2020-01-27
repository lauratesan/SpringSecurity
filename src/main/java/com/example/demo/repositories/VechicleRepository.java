package com.example.demo.repositories;

import com.example.demo.models.Vechicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vechicle, Long> {
}