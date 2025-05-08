package com.example.classRoomAPI.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

//Completado
@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_course")
    private Integer id;

    @Column(name = "name", length = 100, unique = false, nullable = false)
    private String name;

    //creando relacion(muchos a 1)
    @ManyToOne
    @JoinColumn(name = "fk_teacher", referencedColumnName = "id_Teacher")
    @JsonBackReference
    private Teacher teacher;

    //creando relacion(1 a muchos) con asistencia
    @OneToMany(mappedBy = "course")//=Como es conocido esta tabla en la tabla asistencias
    @JsonManagedReference//la que tenga la one lleva jsonmanage
    private List<Assistance> assistance;

    public Course() {
    }

    public Course(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public Integer getIdCourse() {
        return id;
    }

    public void setIdCourse(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
