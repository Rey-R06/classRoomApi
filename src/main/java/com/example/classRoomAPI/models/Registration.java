package com.example.classRoomAPI.models;

import jakarta.persistence.*;

import java.sql.Timestamp;

//faltan relaciones uno a uno
@Entity
@Table(name = "Registrations")
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Registration")
    private Integer id;

    @Column(name = "RegistrationDate", nullable = false)
    private Timestamp RegistrationDate;

    public Registration() {
    }

    public Registration(Integer id, Timestamp registrationDate) {
        this.id = id;
        RegistrationDate = registrationDate;
    }

    public Integer getIdRegistration() {
        return id;
    }

    public void setIdRegistration(Integer id) {
        this.id = id;
    }

    public Timestamp getRegistrationDate() {
        return RegistrationDate;
    }

    public void setRegistrationDate(Timestamp registrationDate) {
        RegistrationDate = registrationDate;
    }
}
