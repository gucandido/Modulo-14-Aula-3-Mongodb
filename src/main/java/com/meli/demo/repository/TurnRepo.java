package com.meli.demo.repository;

import com.meli.demo.domain.Turn;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnRepo extends MongoRepository<Turn, String> {


}
