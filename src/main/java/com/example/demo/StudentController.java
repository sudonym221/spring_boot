package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/")
    @ResponseBody
    public String hello(){
        return "Hello";
    }

    @PostMapping("/register")
    @ResponseBody
    public String register(
            @RequestBody Student student
    ){
        System.out.println(student.getName() + ' ' + student.getEmail());

        studentRepository.save(student);

        return "Student registered";
    }

    @GetMapping("/all")         // Find all students
    @ResponseBody
    public List getAll(){
        List all = studentRepository.findAll();

        System.out.println(all);
        return all;
    }
}