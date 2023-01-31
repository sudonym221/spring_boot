package com.example.demo.Teachers.Repository;

import com.example.demo.Teachers.Model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository  extends JpaRepository<Teacher, Integer> {
    // Query methods
}
