package com.formula.f1data.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.formula.f1data.Entities.LapTimes;
import com.formula.f1data.Entities.LapTimesKey;

public interface LapTimesRepository extends CrudRepository<LapTimes, LapTimesKey>{

    @Query("SELECT laptime from LapTimes laptime where laptime.lapTimesKey.raceId = :raceId and laptime.lapTimesKey.driverId = :driverId")
    List<LapTimes> findLapTimesByRaceIdAndDriverId(Integer raceId, Integer driverId);
}
