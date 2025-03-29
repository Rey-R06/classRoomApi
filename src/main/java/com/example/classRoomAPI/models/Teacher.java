package com.example.classRoomAPI.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

//Lo unico que falta es la relacion uno a uno con la tabla usuario
@Entity
@Table(name = "Teachers")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Teacher")
    private Integer id;

    @Column(name = "speciality", length = 100, nullable = false)
    private String Speciality;

    //creando relacion(1 a muchos) con curso
    @OneToMany(mappedBy = "teacher")//la que tenga la one lleva jsonmanage
    @JsonManagedReference
    private List<Course> courses;

    public Teacher() {
    }

    public Teacher(Integer id, String speciality) {
        this.id = id;
        Speciality = speciality;
    }

    public Integer getIdTeacher() {
        return id;
    }

    public void setIdTeacher(Integer id) {
        this.id = id;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }
}
