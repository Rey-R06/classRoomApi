package com.example.classRoomAPI.models;

import com.example.classRoomAPI.helpers.Status;

import java.time.LocalDate;

public class Assistance {

    private Integer idAssistance;
    private LocalDate date;
    private Status status;

    public Assistance() {
    }

    public Assistance(Integer idAssistance, LocalDate date, Status status) {
        this.idAssistance = idAssistance;
        this.date = date;
        this.status = status;
    }

    public Integer getIdAssistance() {
        return idAssistance;
    }

    public void setIdAssistance(Integer idAssistance) {
        this.idAssistance = idAssistance;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
