package com.example.classRoomAPI.services;


import com.example.classRoomAPI.models.Subjects;
import com.example.classRoomAPI.models.Teacher;
import com.example.classRoomAPI.repository.ISubjects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectServices {

    @Autowired
    ISubjects repository;

    //guardar
    public Subjects saveSubject(Subjects subject)throws Exception{
        try {
            return this.repository.save(subject);
        }catch (Exception error){
            throw new RuntimeException(error.getMessage());
        }
    }


}
