package com.genspark.SpringBootdemoApplication.Service;

import com.genspark.SpringBootdemoApplication.Dao.AlbumDeo;
import com.genspark.SpringBootdemoApplication.Dao.StudentDeo;
import com.genspark.SpringBootdemoApplication.Entity.Album;
import com.genspark.SpringBootdemoApplication.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDeo studentDeo;

    @Override
    public List<Student> getAllStudents() {return this.studentDeo.findAll();}

    @Override
    public Student getStudentById(int studentID) {
        Optional <Student> s = this.studentDeo.findById(studentID);
        Student student = null;
        if (s.isPresent()){
            student = s.get();
        } else {
            throw new RuntimeException(" Student not found for id :: " + studentID);
        }
        return student;
    }

    @Override
    public Student addStudent(Student student) { return this.studentDeo.save(student);
    }

    @Override
    public Student updateStudent(Student student) { return this.studentDeo.save(student);
    }

    @Override
    public String deleteStudentById(int studentID) {
        this.studentDeo.deleteById(studentID);
        return "Deleted Successfully";
    }
}
