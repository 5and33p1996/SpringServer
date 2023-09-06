package com.formula.f1data.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "results")
public class Results {
    
    @Id
    @Column(name = "resultId")
    private Integer resultId;
    private Integer raceId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "driverId")
    private Drivers driver;
    private Integer constructorId;
    private Integer number;
    private Integer grid;
    private Integer position;
    private String positionText;
    private Integer positionOrder;
    private Float points;
    private Integer laps;
    private String time;
    private Integer milliseconds;
    private String fastestLapTime;
    private String fastestLapSpeed;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "statusId")
    private Status status;

    public Integer getResultId() {
        return resultId;
    }
    public void setResultId(Integer resultId) {
        this.resultId = resultId;
    }
    public Integer getRaceId() {
        return raceId;
    }
    public void setRaceId(Integer raceId) {
        this.raceId = raceId;
    }
    public Drivers getDriver() {
        return driver;
    }
    public void setDriver(Drivers driver) {
        this.driver = driver;
    }
    public Integer getConstructorId() {
        return constructorId;
    }
    public void setConstructorId(Integer constructorId) {
        this.constructorId = constructorId;
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public Integer getGrid() {
        return grid;
    }
    public void setGrid(Integer grid) {
        this.grid = grid;
    }
    public Integer getPosition() {
        return position;
    }
    public void setPosition(Integer position) {
        this.position = position;
    }
    public String getPositionText() {
        return positionText;
    }
    public void setPositionText(String positionText) {
        this.positionText = positionText;
    }
    public Integer getPositionOrder() {
        return positionOrder;
    }
    public void setPositionOrder(Integer positionOrder) {
        this.positionOrder = positionOrder;
    }
    public Float getPoints() {
        return points;
    }
    public void setPoints(Float points) {
        this.points = points;
    }
    public Integer getLaps() {
        return laps;
    }
    public void setLaps(Integer laps) {
        this.laps = laps;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public Integer getMilliseconds() {
        return milliseconds;
    }
    public void setMilliseconds(Integer milliseconds) {
        this.milliseconds = milliseconds;
    }
    public String getFastestLapTime() {
        return fastestLapTime;
    }
    public void setFastestLapTime(String fastestLapTime) {
        this.fastestLapTime = fastestLapTime;
    }
    public String getFastestLapSpeed() {
        return fastestLapSpeed;
    }
    public void setFastestLapSpeed(String fastestLapSpeed) {
        this.fastestLapSpeed = fastestLapSpeed;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
}
