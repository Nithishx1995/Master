package com.h2demo.h2demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Setter;

@Entity
@Data
@Setter
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int subjectCode;
    
    @NotNull(message = "Subject name should not be null")
    private String subjectName;

    public void setStudents(Students students) {
        this.students = students;
    }

    @ManyToOne
    @JoinColumn(name = "STUDENT_ID")
    private Students students;

}
