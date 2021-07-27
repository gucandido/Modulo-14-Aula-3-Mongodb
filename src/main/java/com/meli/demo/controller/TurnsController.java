package com.meli.demo.controller;


import com.meli.demo.domain.Dentist;
import com.meli.demo.domain.Patient;
import com.meli.demo.dto.TurnDto;
import com.meli.demo.enums.Status;
import com.meli.demo.payload.IdPayload;
import com.meli.demo.payload.TurnPayload;
import com.meli.demo.service.DentistService;
import com.meli.demo.service.PatientService;
import com.meli.demo.service.TurnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/turn")
public class TurnsController {

    @Autowired
    private TurnService turnService;

    @Autowired
    private DentistService dentistService;

    @Autowired
    private PatientService patientService;


    @PostMapping("")
    public ResponseEntity<?> createTurn(@RequestBody TurnPayload t){

        Dentist d = dentistService.getDentistById(t.getIdDentist());
        Patient p = patientService.getByIdPatient(t.getIdPatient());

        return new ResponseEntity<>(turnService.saveTurn(t,d,p), HttpStatus.CREATED);
    }

    @PostMapping("/cancel")
    public ResponseEntity<?> cancelTurn(@RequestBody IdPayload p){

        return new ResponseEntity<>(turnService.cancelTurn(p.getId()), HttpStatus.CREATED);
    }

    @GetMapping("")
    public ResponseEntity<?> getAll(){

        List<TurnDto> list = new ArrayList<>();

        turnService.getAll().forEach(x-> list.add(TurnDto.classToDto(x)));

        return new ResponseEntity<>(list, HttpStatus.ACCEPTED);

    }

    @GetMapping("/dentist")
    public ResponseEntity<?> getAllByDentist(@RequestParam(required = true, name = "idDentist") String idDentist){

        List<TurnDto> list = new ArrayList<>();

        turnService.getAllByIdDentist(idDentist).forEach(x-> list.add(TurnDto.classToDto(x)));

        return new ResponseEntity<>(list, HttpStatus.ACCEPTED);

    }

    @GetMapping("/status")
    public ResponseEntity<?> getAllByStatus(@RequestParam(required = true, name = "status") Status status){

        List<TurnDto> list = new ArrayList<>();

        turnService.getAllByStatus(status).forEach(x-> list.add(TurnDto.classToDto(x)));

        return new ResponseEntity<>(list, HttpStatus.ACCEPTED);

    }

    @DeleteMapping("")
    public ResponseEntity<?> deleteTurn(@RequestBody IdPayload d){
        return new ResponseEntity<>(turnService.deleteTurn(d.getId()), HttpStatus.CREATED);
    }

}
