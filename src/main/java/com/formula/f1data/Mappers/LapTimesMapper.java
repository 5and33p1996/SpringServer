package com.formula.f1data.Mappers;

import org.springframework.stereotype.Component;

import com.formula.f1data.DTO.LapTimesDTO;
import com.formula.f1data.Entities.LapTimes;

@Component
public class LapTimesMapper {
    
    public LapTimesDTO mapDto(LapTimes lapTimes){

        LapTimesDTO lapTimesDTO = new LapTimesDTO();

        lapTimesDTO.setLap(lapTimes.getLapTimesKey().getLap());
        lapTimesDTO.setSeconds(lapTimes.getMilliseconds()/1000.0);

        return lapTimesDTO;
    }
}
