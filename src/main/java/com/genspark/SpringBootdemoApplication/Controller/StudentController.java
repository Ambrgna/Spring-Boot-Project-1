package com.genspark.SpringBootdemoApplication.Controller;

import com.genspark.SpringBootdemoApplication.Entity.Student;
import com.genspark.SpringBootdemoApplication.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String home()
    {
        return "<HTML><H1>Welcome to Student Application</H1><HTML>";
    }
    @GetMapping("/students")
    public List<Student> getCourses(){
        return this.studentService.getAllStudents();
    }
    @GetMapping("/students/{ID}")
    public Student getCourse(@PathVariable String ID){
        return this.studentService.getStudentById(Integer.parseInt(ID));
    }
    @PostMapping("/students")
    public Student addCourse(@RequestBody Student student){
        return this.studentService.addStudent(student);
    }
    @PutMapping("/students")
    public Student updateCourse(@RequestBody Student student){
        return this.studentService.updateStudent(student);
    }
    @DeleteMapping("/students/{ID}")
    public String deleteCourse(@PathVariable String ID){
        return this.studentService.deleteStudentById(Integer.parseInt(ID));
    }
}
