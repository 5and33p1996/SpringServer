package com.formula.f1data.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class LapTimesKey{
    
    @Column(name = "raceId")
    private Integer raceId;
    @Column(name = "driverId")
    private Integer driverId;
    @Column(name = "lap")
    private Integer lap;

    public LapTimesKey() {
        
    }

    public Integer getRaceId() {
        return raceId;
    }
    public void setRaceId(Integer raceId) {
        this.raceId = raceId;
    }
    public Integer getDriverId() {
        return driverId;
    }
    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }
    public Integer getLap() {
        return lap;
    }
    public void setLap(Integer lap) {
        this.lap = lap;
    }
}
