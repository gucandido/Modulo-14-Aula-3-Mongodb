package com.meli.demo.domain;

import com.meli.demo.enums.Gender;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "patient")
public class Patient {

    @Id
    private String id;

    private String idPatient;

    private String name;

    private String lastName;

    private Integer age;

    private Gender gender;

    public Patient(String idPatient, String name, String lastName, Integer age, Gender gender) {
        this.idPatient = idPatient;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(String idPatient) {
        this.idPatient = idPatient;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}

