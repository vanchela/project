package com.example.project.repository;

import com.example.project.model.entities.FormResqueAnimal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormResqueAnimalRepository extends JpaRepository<FormResqueAnimal,Long> {
}
