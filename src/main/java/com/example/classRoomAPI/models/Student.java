package com.example.classRoomAPI.models;

import java.time.LocalDate;

public class Student {

    private Integer idStudent;
    private Integer grade;
    private LocalDate bornDate;
    private String address;


    public Student() {
    }

    public Student(Integer idStudent, Integer idUser, Integer grade, String address, LocalDate bornDate) {
        this.idStudent = idStudent;
        this.grade = grade;
        this.address = address;
        this.bornDate = bornDate;
    }

    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBornDate() {
        return bornDate;
    }

    public void setBornDate(LocalDate bornDate) {
        this.bornDate = bornDate;
    }
}
