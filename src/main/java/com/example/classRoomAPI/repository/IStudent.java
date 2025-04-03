package com.example.classRoomAPI.repository;

import com.example.classRoomAPI.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudent extends JpaRepository<Student, Integer> {

    //Si tengo consultas personalizadas deben ir en este espacio
}
