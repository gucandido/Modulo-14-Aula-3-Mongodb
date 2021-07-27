package com.meli.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "dentist")
public class Dentist {

    @Id
    private String id;

    private String idDentist;

    private String name;

    private String lastName;

    private String specialty;

    public Dentist() {
    }

    public Dentist(String idDentist, String name, String lastName, String specialty) {
        this.idDentist = idDentist;
        this.name = name;
        this.lastName = lastName;
        this.specialty = specialty;
    }

    public Dentist(Dentist d) {
        this.idDentist = d.getIdDentist();
        this.name = d.getName();
        this.lastName = d.getLastName();
        this.specialty = d.getSpecialty();
    }

    public String getIdDentist() {
        return idDentist;
    }

    public void setIdDentist(String idDentist) {
        this.idDentist = idDentist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getId() {
        return id;
    }
}
