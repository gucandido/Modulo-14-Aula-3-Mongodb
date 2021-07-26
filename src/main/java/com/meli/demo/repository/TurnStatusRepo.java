package com.meli.demo.repository;

import com.meli.demo.domain.TurnStatus;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnStatusRepo extends MongoRepository<TurnStatus, Long> {
}
