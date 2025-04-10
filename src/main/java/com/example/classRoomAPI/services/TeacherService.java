package com.example.classRoomAPI.services;

import com.example.classRoomAPI.models.Teacher;
import com.example.classRoomAPI.repository.ITeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    ITeacherRepository repository;

    //guardar
    public Teacher saveTeacher(Teacher teacher)throws Exception{
        try {
            return this.repository.save(teacher);
        }catch (Exception error){
            throw new RuntimeException(error.getMessage());
        }
    }

    //Buscar todos
    public List<Teacher> searcheAll()throws Exception{
        try{
            return this.repository.findAll();
        }catch (Exception error){
            throw new RuntimeException(error.getMessage());
        }
    }
}
