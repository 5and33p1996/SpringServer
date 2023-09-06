package com.formula.f1data.Entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "lap_times")
public class LapTimes {
    
    @EmbeddedId
    private LapTimesKey lapTimesKey;
    private Integer position;
    private String time;
    private int milliseconds;

    public LapTimesKey getLapTimesKey() {
        return lapTimesKey;
    }
    public void setLapTimesKey(LapTimesKey id) {
        this.lapTimesKey = id;
    }
    public Integer getPosition() {
        return position;
    }
    public void setPosition(Integer position) {
        this.position = position;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public int getMilliseconds() {
        return milliseconds;
    }
    public void setMilliseconds(int milliseconds) {
        this.milliseconds = milliseconds;
    }
}