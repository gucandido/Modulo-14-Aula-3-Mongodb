package com.meli.demo.payload;

import com.meli.demo.domain.Dentist;

public class DentistPayload {

    private String idDentist;

    private String name;

    private String lastName;

    private String specialty;

    public DentistPayload(String idDentist, String name, String lastName, String specialty) {
        this.idDentist = idDentist;
        this.name = name;
        this.lastName = lastName;
        this.specialty = specialty;
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

    public Dentist toDentist(){
        return new Dentist(this.idDentist, this.name,this.lastName, this.specialty);
    }

}
