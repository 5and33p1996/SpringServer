package com.formula.f1data.Controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.formula.f1data.DTO.LapTimesDTO;
import com.formula.f1data.DTO.RacesDTO;
import com.formula.f1data.DTO.ResultsDTO;
import com.formula.f1data.Entities.Circuits;
import com.formula.f1data.Entities.Drivers;
import com.formula.f1data.Entities.Races;
import com.formula.f1data.Entities.Results;
import com.formula.f1data.Entities.Status;
import com.formula.f1data.Mappers.LapTimesMapper;
import com.formula.f1data.Mappers.RacesMapper;
import com.formula.f1data.Mappers.ResultsMapper;
import com.formula.f1data.Repositories.DriversRepository;
import com.formula.f1data.Repositories.LapTimesRepository;
import com.formula.f1data.Repositories.RacesRepository;
import com.formula.f1data.Repositories.ResultsRepository;

@RestController
public class DataController {
    
    @Autowired
    private DriversRepository driversRepository;

    @Autowired
    private LapTimesRepository lapTimesRepository;

    @Autowired
    private RacesRepository racesRepository;

    @Autowired
    private ResultsRepository resultsRepository;

    private RacesMapper racesMapper = new RacesMapper();
    private ResultsMapper resultsMapper = new ResultsMapper();
    private LapTimesMapper lapTimesMapper = new LapTimesMapper();

    @GetMapping("/drivers")
    public Iterable<Drivers> getAllDrivers(){
        return driversRepository.findAll();
    }

    @GetMapping("/laptimes")
    public Iterable<LapTimesDTO> getLapTime(@RequestParam(value = "raceId") Integer raceId, @RequestParam(value = "driverId") Integer driverId){

        return lapTimesRepository.findLapTimesByRaceIdAndDriverId(raceId, driverId).stream()
            .map(lapTimesMapper::mapDto).collect(Collectors.toList());
    }

    @GetMapping("/races")
    public List<RacesDTO> getRaces(@RequestParam(value = "season") Integer season){
        List<Object[]> l = racesRepository.findRacesByYear(season);

        return l.stream().
            map((Object[] obj) -> racesMapper.mapDto((Circuits) obj[0], (Races) obj[1])).collect(Collectors.toList());
    }

    @GetMapping("/results")
    public List<ResultsDTO> getResults(@RequestParam(value = "raceId") Integer raceId){
        List<Object[]> list = resultsRepository.findResultsByRaceId(raceId);

        return list.stream().
        map((Object[] obj) -> resultsMapper.mapDto((Results) obj[0], (Drivers) obj[1], (Status) obj[2])).collect(Collectors.toList());
    }
}
