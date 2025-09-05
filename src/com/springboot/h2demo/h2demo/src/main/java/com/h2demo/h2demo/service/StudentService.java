package com.h2demo.h2demo.service;

import com.h2demo.h2demo.entity.Students;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StudentService {
    public List<Students> getStudents();

    boolean createStudents(Students students);

    Students getStudentById(Long id);
}
