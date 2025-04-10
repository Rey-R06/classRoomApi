package com.example.classRoomAPI.services;

import com.example.classRoomAPI.models.Registration;
import com.example.classRoomAPI.repository.IRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServices {
    @Autowired
    IRegistration repository;

    public Registration saveRegistration(Registration registration)throws Exception{
        try{
            return this.repository.save(registration);
        }catch (Exception error){
            throw new RuntimeException(error.getMessage());
        }
    }
}
