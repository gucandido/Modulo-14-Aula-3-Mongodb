package com.meli.demo.controller;

import com.meli.demo.dto.DentistDto;
import com.meli.demo.payload.IdPayload;
import com.meli.demo.payload.DentistPayload;
import com.meli.demo.service.DentistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/dentist")
public class DentistController {

    @Autowired
    private DentistService service;


    @PostMapping("")
    public ResponseEntity<?> createDentist(@RequestBody DentistPayload d){
        return new ResponseEntity<>(service.saveDentist(d.toDentist()), HttpStatus.CREATED);
    }

    @GetMapping("")
    public ResponseEntity<?> getAll(){

        List<DentistDto> list = new ArrayList<>();

        service.getAll().forEach(x-> list.add(DentistDto.classToDto(x)));

        return new ResponseEntity<>(list, HttpStatus.CREATED);

    }

    @DeleteMapping ("")
    public ResponseEntity<?> deleteDentist(@RequestBody IdPayload d){
        return new ResponseEntity<>(service.deleteDentist(d.getId()), HttpStatus.CREATED);
    }


}
