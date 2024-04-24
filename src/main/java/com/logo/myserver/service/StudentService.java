package com.logo.myserver.service;

import com.logo.myserver.model.Student;

import java.util.List;

public interface StudentService {
    void saveStudent(Student student);
    List<Student> getAllStudents();
}
