package com.example.classRoomAPI.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;
//completado
@Entity
public class Qualifications {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Qualification")
    private Integer id;

    @Column(name = "note", nullable = false)
    private Float note;

    @Column(name = "evaluation_date", nullable = false)
    private LocalDate evaluationDate;

    //creando relacion(muchos a 1) con estudiantes
    @ManyToOne
    @JoinColumn(name = "fk_student", referencedColumnName = "id_student")
    @JsonBackReference//la que tenga la many lleva jsonback
    private Student student;

    //creando relacion(muchos a 1) con materias
    @ManyToOne
    @JoinColumn(name = "fk_subject", referencedColumnName = "id_subject")
    @JsonBackReference//la que tenga la many lleva jsonback
    private Subjects subject;


    public Qualifications() {
    }

    public Qualifications(Integer id, LocalDate evaluationDate, Float note) {
        this.id = id;
        this.evaluationDate = evaluationDate;
        this.note = note;
    }

    public Integer getIdQualification() {
        return id;
    }

    public void setIdQualification(Integer id) {
        this.id = id;
    }

    public Float getNote() {
        return note;
    }

    public void setNote(Float note) {
        this.note = note;
    }

    public LocalDate getEvaluationDate() {
        return evaluationDate;
    }

    public void setEvaluationDate(LocalDate evaluationDate) {
        this.evaluationDate = evaluationDate;
    }
}
