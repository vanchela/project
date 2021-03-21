package com.example.project.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "animals")
public class Animal extends BaseEntity {
    private String photo;
    private String name;
    private AnimalSpecie specie;
    private int age;
    private String description;

    public Animal() {
    }

    @Column(columnDefinition = "BLOB")
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Column(nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne
    public AnimalSpecie getSpecie() {
        return specie;
    }

    public void setSpecie(AnimalSpecie specie) {
        this.specie = specie;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Column(columnDefinition = "TEXT")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
