package com.h2demo.h2demo.service.impl;

import com.h2demo.h2demo.entity.Students;
import com.h2demo.h2demo.repository.StudentsRepo;
import com.h2demo.h2demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
public class StudentsServiceImpl implements StudentService {

    @Autowired
    StudentsRepo studentsRepo;



    @Override
    public List<Students> getStudents() {

        return studentsRepo.findAll();
    }

    @Override
    public boolean createStudents(Students students) {

       studentsRepo.save(students);
       return true;

    }

    @Override
    public Students getStudentById(Long id) {

       // List<Students> students = getStudents();

        if (id == null) {
            throw  new IllegalArgumentException("Student must not be null");
        }
        return studentsRepo
                .findById(id)
                .orElseThrow(()->new RuntimeException("Student ID not found"));


    }

}
