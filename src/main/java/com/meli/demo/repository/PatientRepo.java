package com.meli.demo.repository;

import com.meli.demo.domain.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PatientRepo extends MongoRepository<Patient, Long> {

    public List<Patient> findPatientsByTurnsDay(LocalDate date);

}
