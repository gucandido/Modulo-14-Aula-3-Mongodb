package com.meli.demo.repository;

import com.meli.demo.domain.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends MongoRepository<Patient, String> {

    public Patient findByIdPatient(String id);
    public void deleteByIdPatient(String id);

}
