package com.example.classRoomAPI.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;
//completado
@Entity
public class Subjects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Subject")
    private Integer id;

    @Column(name = "speciality", length = 100, nullable = false)
    private String name;

    //creando relacion(1 a muchos) con calificaciones
    @OneToMany(mappedBy = "subject")
    @JsonManagedReference//la que tenga la one lleva jsonmanage
    private List<Qualifications> Qualification;

    public Subjects() {
    }

    public Subjects(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getIdSubject() {
        return id;
    }

    public void setIdSubject(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
