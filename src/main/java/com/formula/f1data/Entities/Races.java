package com.formula.f1data.Entities;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "races")
public class Races {
    
    @Id
    @Column(name = "raceId")
    private Integer raceId;
    private Integer year;
    private Integer round;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "circuitId")
    private Circuits circuit;
    
    private String name;
    private Date date;
    private Time time;
    private String url;
    @Column(name = "fp1_date")
    private Date fp1Date;
    @Column(name = "fp1_time")
    private Time fp1Time;
    @Column(name = "fp2_date")
    private Date fp2Date;
    @Column(name = "fp2_time")
    private Time fp2Time;
    @Column(name = "fp3_date")
    private Date fp3Date;
    @Column(name = "fp3_time")
    private Time fp3Time;
    @Column(name = "quali_date")
    private Date qualiDate;
    @Column(name = "quali_time")
    private Time qualiTime;
    @Column(name = "sprint_date")
    private Date sprintDate;
    @Column(name = "sprint_time")
    private Time sprintTime;

    public Integer getRaceId() {
        return raceId;
    }
    public void setRaceId(Integer raceId) {
        this.raceId = raceId;
    }
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    public Integer getRound() {
        return round;
    }
    public void setRound(Integer round) {
        this.round = round;
    }
    public Circuits getCircuit() {
        return circuit;
    }
    public void setCircuit(Circuits circuit) {
        this.circuit = circuit;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Time getTime() {
        return time;
    }
    public void setTime(Time time) {
        this.time = time;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public Date getFp1Date() {
        return fp1Date;
    }
    public void setFp1Date(Date fp1Date) {
        this.fp1Date = fp1Date;
    }
    public Time getFp1Time() {
        return fp1Time;
    }
    public void setFp1Time(Time fp1Time) {
        this.fp1Time = fp1Time;
    }
    public Date getFp2Date() {
        return fp2Date;
    }
    public void setFp2Date(Date fp2Date) {
        this.fp2Date = fp2Date;
    }
    public Time getFp2Time() {
        return fp2Time;
    }
    public void setFp2Time(Time fp2Time) {
        this.fp2Time = fp2Time;
    }
    public Date getFp3Date() {
        return fp3Date;
    }
    public void setFp3Date(Date fp3Date) {
        this.fp3Date = fp3Date;
    }
    public Time getFp3Time() {
        return fp3Time;
    }
    public void setFp3Time(Time fp3Time) {
        this.fp3Time = fp3Time;
    }
    public Date getQualiDate() {
        return qualiDate;
    }
    public void setQualiDate(Date qualiDate) {
        this.qualiDate = qualiDate;
    }
    public Time getQualiTime() {
        return qualiTime;
    }
    public void setQualiTime(Time qualiTime) {
        this.qualiTime = qualiTime;
    }
    public Date getSprintDate() {
        return sprintDate;
    }
    public void setSprintDate(Date sprintDate) {
        this.sprintDate = sprintDate;
    }
    public Time getSprintTime() {
        return sprintTime;
    }
    public void setSprintTime(Time sprintTime) {
        this.sprintTime = sprintTime;
    }
}
