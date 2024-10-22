package org.example.springboot_01_10_24.repository;

import org.example.springboot_01_10_24.model.model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface Raptor {
    @Repository
    public interface ProduktRepository extends JpaRepository<model.Produkt, Long>{

    }
}
