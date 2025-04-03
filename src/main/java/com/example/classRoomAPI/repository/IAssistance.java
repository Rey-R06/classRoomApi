package com.example.classRoomAPI.repository;

import com.example.classRoomAPI.models.Assistance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAssistance extends JpaRepository<Assistance, Integer> {

    //Si tengo consultas personalizadas deben ir en este espacio
}
