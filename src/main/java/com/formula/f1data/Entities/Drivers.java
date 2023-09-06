package com.formula.f1data.Entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "drivers")
public class Drivers {
    
    @Id
    @Column(name = "driverId")
    private Integer driverId;
    private String driverRef;
    private Integer number;
    private String code;
    private String forename;
    private String surname;
    private Date dob;
    private String nationality;
    private String url;
    
    public Integer getDriverId() {
        return driverId;
    }
    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }
    public String getDriverRef() {
        return driverRef;
    }
    public void setDriverRef(String driverRef) {
        this.driverRef = driverRef;
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
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
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}
