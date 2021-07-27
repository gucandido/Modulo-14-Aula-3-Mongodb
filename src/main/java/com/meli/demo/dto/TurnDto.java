package com.meli.demo.dto;
import com.meli.demo.domain.Dentist;
import com.meli.demo.domain.Patient;
import com.meli.demo.domain.Turn;
import com.meli.demo.enums.Status;

import java.time.LocalDate;

public class TurnDto {

    private String idTurn;
    private LocalDate day;

    private DentistDto dentist;

    private PatientDto patient;

    private Status status;

    public TurnDto() {
    }

    public TurnDto(String idTurn, LocalDate day, DentistDto dentist, PatientDto patient, Status status) {
        this.idTurn = idTurn;
        this.day = day;
        this.dentist = dentist;
        this.patient = patient;
        this.status = status;
    }

    public TurnDto(Turn t) {
        this.idTurn = t.getId();
        this.day = t.getDay();
        this.dentist = DentistDto.classToDto(t.getDentist());
        this.patient = PatientDto.classToDto(t.getPatient());
        this.status = t.getStatus();
    }

    public String getIdTurn() {
        return idTurn;
    }

    public void setIdTurn(String idTurn) {
        this.idTurn = idTurn;
    }

    public LocalDate getDay() {
        return day;
    }

    public void setDay(LocalDate day) {
        this.day = day;
    }

    public DentistDto getDentist() {
        return dentist;
    }

    public void setDentist(DentistDto dentist) {
        this.dentist = dentist;
    }

    public PatientDto getPatient() {
        return patient;
    }

    public void setPatient(PatientDto patient) {
        this.patient = patient;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public static TurnDto classToDto(Turn t){
        return new TurnDto(t);
    }
}
