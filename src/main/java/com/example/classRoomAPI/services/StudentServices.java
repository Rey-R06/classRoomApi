package com.example.classRoomAPI.services;

import com.example.classRoomAPI.models.Student;
import com.example.classRoomAPI.repository.IStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServices {

    @Autowired
    IStudent repository;

    //guardar
    public Student saveStudent(Student student)throws Exception{
        try {
            return this.repository.save(student);
        }catch (Exception error){
            throw new RuntimeException(error.getMessage());
        }
    }
}
