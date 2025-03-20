package com.example.classRoomAPI.models;

import java.sql.Timestamp;

public class Registration {

    private Integer idRegistration;
    private Timestamp RegistrationDate;

    public Registration() {
    }

    public Registration(Integer idRegistration, Timestamp registrationDate) {
        this.idRegistration = idRegistration;
        RegistrationDate = registrationDate;
    }

    public Integer getIdRegistration() {
        return idRegistration;
    }

    public void setIdRegistration(Integer idRegistration) {
        this.idRegistration = idRegistration;
    }

    public Timestamp getRegistrationDate() {
        return RegistrationDate;
    }

    public void setRegistrationDate(Timestamp registrationDate) {
        RegistrationDate = registrationDate;
    }
}
