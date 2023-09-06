package com.formula.f1data.Mappers;

import org.springframework.stereotype.Component;

import com.formula.f1data.DTO.RacesDTO;
import com.formula.f1data.Entities.Circuits;
import com.formula.f1data.Entities.Races;

@Component
public class RacesMapper {
    
    public RacesDTO mapDto(Circuits circuit, Races race){

        RacesDTO racesDTO  = new RacesDTO();

        racesDTO.setRaceId(race.getRaceId());
        racesDTO.setCountry(circuit.getCountry());

        return racesDTO;
    }
}
