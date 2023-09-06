package com.formula.f1data.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.formula.f1data.Entities.Races;

public interface RacesRepository extends CrudRepository<Races, Integer>{
    
    @Query("SELECT r.circuit, r FROM Races r where r.year = :year order by r.round")
    List<Object[]> findRacesByYear(Integer year);
}
