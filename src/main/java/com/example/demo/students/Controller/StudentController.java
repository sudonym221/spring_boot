package com.example.demo.students.Controller;

import com.example.demo.students.Models.Student;
import com.example.demo.students.Repository.StudentRepository;
import com.example.demo.students.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {
    StudentService studentService;

    @GetMapping("/")                // Home page
    @ResponseBody
    public String hello(){
        return "Hello";
    }

    @PostMapping("/register")      // Create a student record
    @ResponseBody
    public String register(
            @RequestBody Student student
    ){
        studentService.registerStudent(student);
        return "Student registered";
    }

    @GetMapping("/all")         // Find all students
    @ResponseBody
    public List getAll(){
        List all = studentService.getAllStudents();
        return all;
    }

    @GetMapping("/find/{email}")    // Find by email
    @ResponseBody
    public  List findByEmail(@PathVariable(value = "email") String email){
        List records = studentService.findStudentByEmail(email);
        return records;
    }

    @DeleteMapping("/delete/{id}")              // Delete student record
    @ResponseBody
    public String delete(@PathVariable(value = "id") Integer id){
        studentService.deleteStudentRecord(id);
        return "Record deleted";
    }

    @PutMapping("/update/{id}")                // Update student record
    @ResponseBody
    public String update(
            @PathVariable(value = "id") Integer id,
            @RequestBody Student updatedStudent
            ){
        studentService.updateStudentRecord(updatedStudent);
        return "Record updated";
    }
}