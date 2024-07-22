package com.example.Checking_Database.controller;

import com.example.Checking_Database.model.Student;
import com.example.Checking_Database.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
public class CheckController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/hello")
    public String HelloWorld(){
        return "Hello World...!!";
    }

    @PostMapping("/create")
    public String create(@RequestBody Student student){
       return studentService.save(student);
    }

    @GetMapping("/students")
    public List<Student> allStudent(){
        return studentService.getAllStudent();
    }
}
