package com.formula.f1data.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestParam;

import com.formula.f1data.Entities.Results;

public interface ResultsRepository extends CrudRepository<Results, Integer>{

    @Query("SELECT r, r.driver, r.status FROM Results r where r.raceId = :raceId")
    List<Object[]> findResultsByRaceId(@RequestParam(value = "raceId") Integer raceId);
}
