package com.meli.demo.repository;

import com.meli.demo.domain.Dentist;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DentistRepo extends MongoRepository<Dentist, String> {

    public Dentist findByIdDentist(String id);

}
