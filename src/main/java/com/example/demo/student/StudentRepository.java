package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Basically this will be the Data access layer
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
