package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
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

        return "Student registered";
    }
}