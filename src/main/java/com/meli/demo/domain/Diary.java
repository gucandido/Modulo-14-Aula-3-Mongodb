package com.meli.demo.domain;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "diary")
public class Diary {

    @Id
    private String idDiary;

    private LocalDateTime startTime;
    private LocalDateTime endingTime;

    @DBRef
    private List<Turn> turns;

    public Diary() {
    }

    public Diary(LocalDateTime startTime, LocalDateTime endingTime) {
        this.startTime = startTime;
        this.endingTime = endingTime;
    }

    public String getIdDiary() {
        return idDiary;
    }

    public void setIdDiary(String idDiary) {
        this.idDiary = idDiary;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndingTime() {
        return endingTime;
    }

    public void setEndingTime(LocalDateTime endingTime) {
        this.endingTime = endingTime;
    }

    public List<Turn> getTurns() {
        return turns;
    }

    public void setTurns(List<Turn> turns) {
        this.turns = turns;
    }
}
