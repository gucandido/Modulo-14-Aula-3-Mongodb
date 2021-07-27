package com.meli.demo.domain;

import com.meli.demo.enums.Status;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "turn")
public class Turn {

    @Id
    private String id;

    private LocalDate day;

    @DBRef
    private Dentist dentist;

    @DBRef
    private Patient patient;

    private Status status;

    public Turn() {
    }

    public Turn(LocalDate day, Dentist dentist, Patient patient) {
        this.day = day;
        this.dentist = dentist;
        this.patient = patient;
        this.status = Status.ATIVO;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDay() {
        return day;
    }

    public void setDay(LocalDate day) {
        this.day = day;
    }

    public Dentist getDentist() {
        return dentist;
    }

    public void setDentist(Dentist dentist) {
        this.dentist = dentist;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
