package com.example.classRoomAPI.repository;

import com.example.classRoomAPI.models.Qualifications;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IQualifications extends JpaRepository<Qualifications, Integer> {

    //Si tengo consultas personalizadas deben ir en este espacio
}
