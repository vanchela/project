package com.example.project.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "forms_resque_animals")
public class FormResqueAnimal extends BaseEntity {
    private Animal animal;
    private User user;
    private String text;

    public FormResqueAnimal() {
    }

    @ManyToOne
    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Column(columnDefinition = "TEXT", nullable = false)
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
