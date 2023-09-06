package com.formula.f1data.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Circuits {
    
    @Id
    @Column(name = "circuitId")
    private Integer circuitId;
    @Column(name = "circuitRef")
    private String circuitRef;
    private String name;
    private String location;
    private String country;
    private Float lat;
    private Float lng;
    private Integer alt;
    private String url;

    public Integer getCircuitId() {
        return circuitId;
    }
    public void setCircuitId(Integer circuitId) {
        this.circuitId = circuitId;
    }
    public String getCircuitRef() {
        return circuitRef;
    }
    public void setCircuitRef(String circuitRef) {
        this.circuitRef = circuitRef;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public Float getLat() {
        return lat;
    }
    public void setLat(Float lat) {
        this.lat = lat;
    }
    public Float getLng() {
        return lng;
    }
    public void setLng(Float lng) {
        this.lng = lng;
    }
    public Integer getAlt() {
        return alt;
    }
    public void setAlt(Integer alt) {
        this.alt = alt;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}
