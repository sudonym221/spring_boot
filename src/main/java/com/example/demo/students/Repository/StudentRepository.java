package com.example.demo.students.Repository;

import com.example.demo.students.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    // Add query methods
    List findStudentsByEmailEquals(String email);

}

