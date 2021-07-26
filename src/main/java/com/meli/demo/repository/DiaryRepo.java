package com.meli.demo.repository;

import com.meli.demo.domain.Dentist;
import com.meli.demo.domain.Diary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiaryRepo extends MongoRepository<Diary, Long> {

    public List<Diary> findDiariesByDentist(Dentist d);

}
