package com.example.classRoomAPI.services;

import com.example.classRoomAPI.models.Course;
import com.example.classRoomAPI.repository.ICourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServices {
    @Autowired
    ICourse repository;

    public Course saveCourse(Course course)throws Exception{
        try{
            return this.repository.save(course);
        }catch (Exception error){
            throw new RuntimeException(error.getMessage());
        }
    }
}
