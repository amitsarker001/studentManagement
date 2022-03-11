package com.management.student.service;

import com.management.student.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);

}
