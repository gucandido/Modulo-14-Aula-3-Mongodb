package com.meli.demo.repository;

import com.meli.demo.domain.Dentist;
import com.meli.demo.domain.Turn;
import com.meli.demo.enums.Status;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TurnRepo extends MongoRepository<Turn, String> {

    public List<Turn> findTurnsByStatus(Status status);
    public List<Turn> findTurnsByDentist(Dentist d);


}
