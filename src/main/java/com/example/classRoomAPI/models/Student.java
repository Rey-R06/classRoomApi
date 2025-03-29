package com.example.classRoomAPI.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;


//Lo unico que falta es la relacion uno a uno con la tabla usuario
@Entity
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Student")
    private Integer id;

    @Column(name = "grade", unique = true, nullable = false)
    private Integer grade;

    @Column(name = "bornDate", nullable = false)
    private LocalDate bornDate;

    @Column(name = "address", length = 255, nullable = false)
    private String address;

    //creando relacion(1 a muchos) con calificaciones
    @OneToMany(mappedBy = "student")//=Como es conocido esta tabla en la tabla asistencias
    @JsonManagedReference//la que tenga la one lleva jsonmanage
    private List<Qualifications> Qualification;

    //creando relacion(1 a muchos) con asistencia
    @OneToMany(mappedBy = "student")//=Como es conocido esta tabla en la tabla asistencias
    @JsonManagedReference//la que tenga la one lleva jsonmanage
    private List<Assistance> assistance;



    public Student() {
    }

    public Student(Integer id, Integer idUser, Integer grade, String address, LocalDate bornDate) {
        this.id = id;
        this.grade = grade;
        this.address = address;
        this.bornDate = bornDate;
    }

    public Integer getIdStudent() {
        return id;
    }

    public void setIdStudent(Integer id) {
        this.id = id;
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
