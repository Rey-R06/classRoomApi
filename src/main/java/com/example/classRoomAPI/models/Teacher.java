package com.example.classRoomAPI.models;

public class Teacher {
    private Integer idTeacher;
    private String Speciality;

    public Teacher() {
    }

    public Teacher(Integer idTeacher, String speciality) {
        this.idTeacher = idTeacher;
        Speciality = speciality;
    }

    public Integer getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Integer idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }
}
