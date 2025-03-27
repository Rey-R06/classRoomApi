package com.example.classRoomAPI.models;

import jakarta.persistence.*;

@Entity
@Table(name = "cursos")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_course")
    private Integer id;

    @Column(name = "name", length = 100, unique = false, nullable = false)
    private String name;

    public Course() {
    }

    public Course(String name, Integer idCourse) {
        this.name = name;
        this.id = id;
    }

    public Integer getIdCourse() {
        return id;
    }

    public void setIdCourse(Integer idCourse) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
