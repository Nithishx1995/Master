package com.h2demo.h2demo.repository;

import com.h2demo.h2demo.entity.Students;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsRepo extends JpaRepository<Students,Long> {

    @EntityGraph(attributePaths = "studentSubject")
    List<Students> findAll();
}
