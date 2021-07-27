package com.meli.demo.dto;

import com.meli.demo.domain.Dentist;

public class DentistDto {

    private String idDentist;

    private String name;

    private String lastName;

    private String specialty;

    public DentistDto(Dentist d) {
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

    public static DentistDto classToDto(Dentist d){
        return d==null?null: new DentistDto(d);
    }
}
