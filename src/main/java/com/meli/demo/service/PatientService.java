package com.meli.demo.service;

import com.meli.demo.domain.Patient;
import com.meli.demo.dto.GenericResponseDto;
import com.meli.demo.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepo repository;

    public PatientService(PatientRepo repository) {
        this.repository = repository;
    }

    public Patient savePatient(Patient patient){
        return repository.save(patient);
    }

    public GenericResponseDto deletePatient(String id){
        repository.deleteByIdPatient(id);
        return new GenericResponseDto("Deletado com sucesso.");
    }

    public List<Patient> getAll(){
        return repository.findAll();
    }

    public Patient getByIdPatient(String id){
        return repository.findByIdPatient(id);
    }


}
