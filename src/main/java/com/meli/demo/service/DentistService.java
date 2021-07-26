package com.meli.demo.service;

import com.meli.demo.domain.Dentist;
import com.meli.demo.dto.GenericResponseDto;
import com.meli.demo.repository.DentistRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DentistService {

    @Autowired
    private DentistRepo repository;

    public DentistService(DentistRepo repository) {
        this.repository = repository;
    }

    public Dentist saveDentist(Dentist dentist){

        Dentist d = repository.findByIdDentist(dentist.getIdDentist());

        if(d==null) { // insert
            d = new Dentist(dentist);
        }else{ // update
            d.setName(dentist.getName());
            d.setLastName(dentist.getLastName());
            d.setSpecialty(dentist.getSpecialty());
        }

        return repository.save(d);

    }

    public GenericResponseDto deleteDentist(String id){

        repository.deleteById(id);
        return new GenericResponseDto("Deletado com sucesso.");

    }

    public List<Dentist> getAll(){
        return repository.findAll();
    }

    public List<Dentist> getAllByDayHavingTwoMore(LocalDate day){
        //return repository.findDentistsByTurnsDayHavingTwoMore(day);
        return repository.findAll();
    }

    public Dentist getDentistById(String id){
        return repository.findByIdDentist(id);
    }
}
