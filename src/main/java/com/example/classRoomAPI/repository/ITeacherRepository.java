package com.example.classRoomAPI.repository;

import com.example.classRoomAPI.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeacherRepository extends JpaRepository<Teacher, Integer> {

    //Si tengo consultas personalizadas deben ir en este espacio
}
