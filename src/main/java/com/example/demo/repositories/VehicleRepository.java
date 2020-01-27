package com.example.demo.repositories;


import com.example.demo.models.Brand;
import com.example.demo.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@RepositoryRestResource(path = "vehicles", collectionResourceRel = "vehicles", itemResourceRel = "vehicle")
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    List<Vehicle> findByBrandIn(List<Brand> brandList);
}