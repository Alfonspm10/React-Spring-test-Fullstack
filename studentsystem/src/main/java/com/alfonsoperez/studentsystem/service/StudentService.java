package com.alfonsoperez.studentsystem.service;

import com.alfonsoperez.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}