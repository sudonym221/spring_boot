package com.example.demo.students.Service;

import com.example.demo.students.Models.Student;
import com.example.demo.students.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    StudentRepository studentRepository;
    public void registerStudent(Student student){
        System.out.println(student.getName() + ' ' + student.getEmail());

        studentRepository.save(student);
    }

    public List getAllStudents(){
        List all = studentRepository.findAll();

        return all;
    }

    public List findStudentByEmail(String email){
        List records = studentRepository.findStudentsByEmailEquals(email);

        return records;
    }

    public void deleteStudentRecord(Integer id){
        studentRepository.deleteById(id);
    }

    public void updateStudentRecord(Student updatedStudent){
        studentRepository.save(updatedStudent);
    }
}
