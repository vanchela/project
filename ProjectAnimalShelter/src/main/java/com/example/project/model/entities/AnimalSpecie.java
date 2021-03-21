package com.example.project.model.entities;

import com.example.project.model.enums.AnimalSpeciesEnum;

import javax.persistence.*;

@Entity
@Table(name = "animal_species")
public class AnimalSpecie extends BaseEntity{
    private AnimalSpeciesEnum animalSpecie;

    public AnimalSpecie() {
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "animal_specie")
    public AnimalSpeciesEnum getAnimalSpecie() {
        return animalSpecie;
    }

    public void setAnimalSpecie(AnimalSpeciesEnum animalSpecie) {
        this.animalSpecie = animalSpecie;
    }
}
