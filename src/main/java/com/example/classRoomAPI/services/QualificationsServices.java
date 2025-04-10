package com.example.classRoomAPI.services;

import com.example.classRoomAPI.models.Qualifications;
import com.example.classRoomAPI.repository.IQualifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QualificationsServices {
    @Autowired
    IQualifications repository;

    public Qualifications saveQualifications(Qualifications qualification)throws Exception{
        try{
            return this.repository.save(qualification);
        }catch (Exception error){
            throw new RuntimeException(error.getMessage());
        }
    }
}
