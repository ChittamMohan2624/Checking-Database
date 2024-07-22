package com.example.Checking_Database.service;

import com.example.Checking_Database.model.Student;
import com.example.Checking_Database.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public String save(Student student){
        studentRepository.save(student);
        return"created record successfully";
    }

    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }
}
