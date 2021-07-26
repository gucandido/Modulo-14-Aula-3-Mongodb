package com.meli.demo.domain;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.List;

@Document(collection = "turnStatus")
public class TurnStatus {

    @Id
    private String idTurnStatus;

    private String name;

    private String description;

    @DBRef
    private List<Turn> turns;

    public TurnStatus() {
    }

    public TurnStatus(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getIdTurnStatus() {
        return idTurnStatus;
    }

    public void setIdTurnStatus(String idTurnStatus) {
        this.idTurnStatus = idTurnStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Turn> getTurns() {
        return turns;
    }

    public void setTurns(List<Turn> turns) {
        this.turns = turns;
    }
}
