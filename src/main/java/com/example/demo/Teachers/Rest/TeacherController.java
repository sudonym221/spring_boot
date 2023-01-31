package com.example.demo.Teachers.Rest;
import com.example.demo.Teachers.Model.Teacher;
import com.example.demo.Teachers.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {
    @Autowired
    TeacherRepository teacherRepository;
    @GetMapping("/teachers")
    public ResponseEntity<String> teacherIndex(){
        return new ResponseEntity<>("Hi", HttpStatus.OK);
    }

    @PostMapping("/teachers")
    public ResponseEntity<Teacher> saveTeacher(@RequestBody Teacher teacher) {

        System.out.println(teacher.getName());


        Teacher savedteacher = teacherRepository.save(teacher);;

        return new ResponseEntity<>(savedteacher, HttpStatus.CREATED);
    }
}
