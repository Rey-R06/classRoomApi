package com.example.classRoomAPI.models;

public class Course {

    private Integer idCourse;
    private String name;

    public Course() {
    }

    public Course(String name, Integer idCourse) {
        this.name = name;
        this.idCourse = idCourse;
    }

    public Integer getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Integer idCourse) {
        this.idCourse = idCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
