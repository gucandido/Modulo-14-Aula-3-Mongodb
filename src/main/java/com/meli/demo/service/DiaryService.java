package com.meli.demo.service;

import com.meli.demo.domain.Dentist;
import com.meli.demo.domain.Diary;
import com.meli.demo.repository.DiaryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiaryService {

    @Autowired
    private DiaryRepo repository;

    public DiaryService(DiaryRepo repository) {
        this.repository = repository;
    }

    public void saveDiary(Diary diary){
        repository.save(diary);
    }

    public void deleteDiary(Long id){
        repository.deleteById(id);
    }

    public List<Diary> getAll(){
        return repository.findAll();
    }

    public List<Diary> getAllByDentist(Dentist d){
        return repository.findDiariesByDentist(d);
    }

}
