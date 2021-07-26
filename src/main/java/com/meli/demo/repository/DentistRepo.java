package com.meli.demo.repository;

import com.meli.demo.domain.Dentist;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DentistRepo extends MongoRepository<Dentist, Long> {

    /*@Query("select d " +
            "from Dentist d join Diary dr on d.idDentist = dr.dentist.idDentist " +
                            "join Turn t on dr.id_diary = t.diary.id_diary " +
            "where t.day = :day " +
            "group by d " +
            "having count(d) > 2")*/
    // public List<Dentist> findDentistsByTurnsDayHavingTwoMore(@Param("day") LocalDate day);

}
