package com.example.classRoomAPI.models;

import java.time.LocalDate;

public class Qualifications {

    private Integer idQualification;
    private Float note;
    private LocalDate evaluationDate;


    public Qualifications() {
    }

    public Qualifications(Integer idQualification, LocalDate evaluationDate, Float note) {
        this.idQualification = idQualification;
        this.evaluationDate = evaluationDate;
        this.note = note;
    }

    public Integer getIdQualification() {
        return idQualification;
    }

    public void setIdQualification(Integer idQualification) {
        this.idQualification = idQualification;
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
