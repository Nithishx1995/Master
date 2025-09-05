package com.h2demo.h2demo.controller;


import com.h2demo.h2demo.entity.Students;
import com.h2demo.h2demo.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {


    private StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping
    public ResponseEntity<List<Students>> getStudents()
    {
        var studentsList=studentService.getStudents();

        if(studentsList.isEmpty())
        {
            return ResponseEntity.status(400).build();
        }

        return ResponseEntity.ok().body(studentsList);

    }

    @GetMapping("/student/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable Long id)
    {
        Students student=studentService.getStudentById(id);

        try {
            return ResponseEntity.ok().body(student);
        }
        catch (IllegalArgumentException ie)
        {
            return ResponseEntity.status(500).body(ie.getMessage());
        }
        catch (RuntimeException re)
        {
            return ResponseEntity.status(404).body(re.getMessage());
        }

    }

    @PostMapping
    public ResponseEntity<?> createStudents(@Valid @RequestBody Students students)
    {
        var createStudent= studentService.createStudents(students);

        if(createStudent)
        {
            return ResponseEntity.status(201).body("Student is added to the Database");
        }
        return ResponseEntity.badRequest().body("Unable to create a Student.. Please Check");
    }



}
