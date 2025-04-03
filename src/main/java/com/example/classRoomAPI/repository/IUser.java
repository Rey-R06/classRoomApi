package com.example.classRoomAPI.repository;

import com.example.classRoomAPI.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUser extends JpaRepository<User, Integer> {

    //Si tengo consultas personalizadas deben ir en este espacio

}
