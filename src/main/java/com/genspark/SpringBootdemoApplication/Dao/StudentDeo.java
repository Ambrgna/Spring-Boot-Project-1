package com.genspark.SpringBootdemoApplication.Dao;

import com.genspark.SpringBootdemoApplication.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDeo extends JpaRepository<Student, Integer> {
}
