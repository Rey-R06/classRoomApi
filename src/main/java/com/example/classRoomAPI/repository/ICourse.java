package com.example.classRoomAPI.repository;

import com.example.classRoomAPI.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourse extends JpaRepository<Course, Integer> {

    //Si tengo consultas personalizadas deben ir en este espacio
}
