package com.example.classRoomAPI.models;

import com.example.classRoomAPI.helpers.Status;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;
//completado
@Entity
@Table(name = "Assistances")
public class Assistance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Assistance")
    private Integer id;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "status", nullable = false)
    private Status status;

    //creando relacion(muchos a 1) con estudiantes
    @ManyToOne
    @JoinColumn(name = "fk_student", referencedColumnName = "id_student")
    @JsonBackReference//la que tenga la many lleva jsonback
    private Student student;

    //creando relacion(muchos a 1) con cursos
    @ManyToOne
    @JoinColumn(name = "fk_course", referencedColumnName = "id_course")
    @JsonBackReference//la que tenga la many lleva jsonback
    private Course course;

    public Assistance() {
    }

    public Assistance(Integer id, LocalDate date, Status status) {
        this.id = id;
        this.date = date;
        this.status = status;
    }

    public Integer getIdAssistance() {
        return id;
    }

    public void setIdAssistance(Integer id) {
        this.id = id;
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
