package com.formula.f1data.Mappers;

import org.springframework.stereotype.Component;

import com.formula.f1data.DTO.ResultsDTO;
import com.formula.f1data.Entities.Drivers;
import com.formula.f1data.Entities.Results;
import com.formula.f1data.Entities.Status;

@Component
public class ResultsMapper {
    
    public ResultsDTO mapDto(Results result, Drivers driver, Status status){

        ResultsDTO resultsDTO = new ResultsDTO();

        resultsDTO.setPosition(result.getPosition());
        resultsDTO.setDriverId(driver.getDriverId());
        resultsDTO.setForename(driver.getForename());
        resultsDTO.setSurname(driver.getSurname());
        resultsDTO.setTime(result.getTime());
        resultsDTO.setStatus(status.getStatus());

        return resultsDTO;
    }
}
