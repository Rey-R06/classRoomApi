package com.example.classRoomAPI.repository;

import com.example.classRoomAPI.models.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRegistration extends JpaRepository<Registration, Integer> {

    //Si tengo consultas personalizadas deben ir en este espacio
}
