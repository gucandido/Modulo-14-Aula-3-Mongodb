package com.meli.demo.service;

import com.meli.demo.domain.Dentist;
import com.meli.demo.domain.Patient;
import com.meli.demo.domain.Turn;
import com.meli.demo.dto.GenericResponseDto;
import com.meli.demo.payload.TurnPayload;
import com.meli.demo.repository.TurnRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnService {

    @Autowired
    private TurnRepo repository;

    public TurnService(TurnRepo repository) {
        this.repository = repository;
    }

    public Turn saveTurn(TurnPayload turn, Dentist d, Patient p){

        Turn t = new Turn(turn.getDate(),d,p);

        return repository.save(t);
    }

    public GenericResponseDto deleteTurn(String id){
        repository.deleteById(id);
        return new GenericResponseDto("Deletado com sucesso.");
    }

    public List<Turn> getAll(){
        return repository.findAll();
    }

    public Turn getById(String id){
        return repository.findById(id).orElse(null);
    }

}
