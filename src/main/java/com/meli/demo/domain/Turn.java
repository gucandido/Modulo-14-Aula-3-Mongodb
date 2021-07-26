package com.meli.demo.domain;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.time.LocalDate;

@Document(collection = "turn")
public class Turn {

    @Id
    private String idTurn;

    private LocalDate day;

    @DBRef
    private TurnStatus turnStatus;

    public Turn() {
    }

    public Turn(LocalDate day, TurnStatus turnStatus) {
        this.day = day;
        this.turnStatus = turnStatus;
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

    public TurnStatus getTurnStatus() {
        return turnStatus;
    }

    public void setTurnStatus(TurnStatus turnStatus) {
        this.turnStatus = turnStatus;
    }
}
