package com.example.classRoomAPI.models;

public class Subjects {

    private Integer idSubject;
    private String name;

    public Subjects() {
    }

    public Subjects(Integer idSubject, String name) {
        this.idSubject = idSubject;
        this.name = name;
    }

    public Integer getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(Integer idSubject) {
        this.idSubject = idSubject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
