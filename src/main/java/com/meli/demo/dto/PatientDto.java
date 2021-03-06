package com.meli.demo.dto;

import com.meli.demo.domain.Patient;
import com.meli.demo.enums.Gender;

public class PatientDto {

    private String idPatient;

    private String name;

    private String lastName;

    private Integer age;

    private Gender gender;

    public PatientDto(Patient p) {
        this.idPatient = p.getIdPatient();
        this.name = p.getName();
        this.lastName = p.getLastName();
        this.age = p.getAge();
        this.gender = p.getGender();
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

    public static PatientDto classToDto(Patient p){
        return p==null?null:new PatientDto(p);
    }
}
