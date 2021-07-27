package com.meli.demo.controller;

import com.meli.demo.dto.PatientDto;
import com.meli.demo.payload.IdPayload;
import com.meli.demo.payload.PatientPayload;
import com.meli.demo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService service;


    @PostMapping("")
    public ResponseEntity<?> createPatient(@RequestBody PatientPayload p){
        return new ResponseEntity<>(service.savePatient(p.toPatient()), HttpStatus.CREATED);
    }

    @GetMapping("")
    public ResponseEntity<?> getAll(){

        List<PatientDto> list = new ArrayList<>();

        service.getAll().forEach(x-> list.add(PatientDto.classToDto(x)));

        return new ResponseEntity<>(list, HttpStatus.ACCEPTED);

    }

    @DeleteMapping("")
    public ResponseEntity<?> deleteDentist(@RequestBody IdPayload d){
        return new ResponseEntity<>(service.deletePatient(d.getId()), HttpStatus.CREATED);
    }

}
