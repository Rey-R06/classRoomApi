package com.example.classRoomAPI.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.OneToMany;

import java.util.List;

public class Teacher {
    private Integer id;
    private String Speciality;

    //creando relacion(1 a muchos)
    @OneToMany(mappedBy = "teacher")//la que tenga la one lleva jsonmanage
    @JsonManagedReference
    private List<Course> courses;

    public Teacher() {
    }

    public Teacher(Integer idTeacher, String speciality) {
        this.id = idTeacher;
        Speciality = speciality;
    }

    public Integer getIdTeacher() {
        return id;
    }

    public void setIdTeacher(Integer idTeacher) {
        this.id = idTeacher;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }
}
