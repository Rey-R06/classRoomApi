package com.example.classRoomAPI.services;

import com.example.classRoomAPI.models.Assistance;
import com.example.classRoomAPI.repository.IAssistance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssistanceServices {
    @Autowired
    IAssistance repository;

    public Assistance saveAssistance(Assistance assistance)throws Exception{
        try{
            return this.repository.save(assistance);
        }catch (Exception error){
            throw new RuntimeException(error.getMessage());
        }
    }
}
