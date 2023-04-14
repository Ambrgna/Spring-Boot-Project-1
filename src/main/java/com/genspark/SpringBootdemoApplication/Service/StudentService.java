package com.genspark.SpringBootdemoApplication.Service;

import com.genspark.SpringBootdemoApplication.Entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(int studentID);
    Student addStudent(Student student);
    Student updateStudent(Student student);
    String deleteStudentById(int studentID);
}
