package com.formula.f1data.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "status")
public class Status {
    @Id
    @Column(name = "statusId")
    private Integer statusId;
    private String status;
    
    public Integer getStatusId() {
        return statusId;
    }
    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
