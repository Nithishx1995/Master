package com.h2demo.h2demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Students {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Students(Long id, String studentName, int studentAge, int studentClass) {
        this.id = id;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentClass = studentClass;
    }


    @NotBlank(message = "Student name should not be null")
    private String studentName;

    private int studentAge;

    @Min(value = 10, message = "Class must be >= 10")
    private int studentClass;

    @OneToMany(mappedBy = "students", cascade = CascadeType.ALL)
    private List<Subject> studentSubject = new ArrayList<>();

    public void addSubject(Subject subject) {
        subject.setStudents(this);
        studentSubject.add(subject);
    }
}
