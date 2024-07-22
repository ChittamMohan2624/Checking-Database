package com.example.Checking_Database.repository;

import com.example.Checking_Database.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
