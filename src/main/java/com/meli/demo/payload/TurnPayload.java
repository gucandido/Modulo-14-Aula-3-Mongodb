package com.meli.demo.payload;

import java.time.LocalDate;

public class TurnPayload {

    private String idDentist;
    private String idPatient;

    private LocalDate day;

    public TurnPayload(String idDentist, String idPatient, LocalDate day) {
        this.idDentist = idDentist;
        this.idPatient = idPatient;
        this.day = day;
    }

    public String getIdDentist() {
        return idDentist;
    }

    public void setIdDentist(String idDentist) {
        this.idDentist = idDentist;
    }

    public String getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(String idPatient) {
        this.idPatient = idPatient;
    }

    public LocalDate getDate() {
        return day;
    }

    public void setDate(LocalDate day) {
        this.day = day;
    }


}
