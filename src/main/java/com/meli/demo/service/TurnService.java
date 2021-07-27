package com.meli.demo.service;

import com.meli.demo.domain.Dentist;
import com.meli.demo.domain.Patient;
import com.meli.demo.domain.Turn;
import com.meli.demo.dto.GenericResponseDto;
import com.meli.demo.enums.Status;
import com.meli.demo.payload.TurnPayload;
import com.meli.demo.repository.DentistRepo;
import com.meli.demo.repository.TurnRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TurnService {

    @Autowired
    private TurnRepo repository;
    @Autowired
    private DentistRepo dentistRepo;

    public TurnService(TurnRepo repository) {
        this.repository = repository;
    }

    public Turn saveTurn(TurnPayload turn, Dentist d, Patient p){

        Turn t = new Turn(turn.getDate(),d,p);

        return repository.save(t);
    }

    public Turn cancelTurn(String id){

        Turn t = repository.findById(id).orElse(null);

        if(t==null)
            throw new NoSuchElementException("Elemento não encontrado");

        t.setStatus(Status.CANCELADO);

        return repository.save(t);
    }

    public GenericResponseDto deleteTurn(String id){
        repository.deleteById(id);
        return new GenericResponseDto("Deletado com sucesso.");
    }

    public List<Turn> getAll(){
        return repository.findAll();
    }

    public List<Turn> getAllByIdDentist(String idDentist){

        Dentist d = dentistRepo.findByIdDentist(idDentist);

        return repository.findTurnsByDentist(d);
    }

    public List<Turn> getAllByStatus(Status status){
        return repository.findTurnsByStatus(status);
    }

}
