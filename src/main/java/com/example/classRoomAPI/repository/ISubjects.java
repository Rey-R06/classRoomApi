package com.example.classRoomAPI.repository;

import com.example.classRoomAPI.models.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISubjects extends JpaRepository<Subjects, Integer> {

    //Si tengo consultas personalizadas deben ir en este espacio
}
