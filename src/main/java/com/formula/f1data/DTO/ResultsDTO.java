package com.formula.f1data.DTO;

public class ResultsDTO {
    
    private Integer position;
    private Integer driverId;
    private String forename;
    private String surname;
    private String time;
    private String status;
    
    public Integer getPosition() {
        return position;
    }
    public void setPosition(Integer position) {
        this.position = position;
    }
    public Integer getDriverId() {
        return driverId;
    }
    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }
    public String getForename() {
        return forename;
    }
    public void setForename(String forename) {
        this.forename = forename;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
}
