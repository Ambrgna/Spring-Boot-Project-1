package com.genspark.SpringBootdemoApplication.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="tbl_student")
public class Student {
    @Id
    @Column(name="s_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int Studentid;
    private String fname;
    private String lname;
    private String major;
    private int year;


    public Student() {
    }

    public Student(int studentid, String fname, String lname, String major, int year) {
        Studentid = studentid;
        this.fname = fname;
        this.lname = lname;
        this.major = major;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentid() {
        return Studentid;
    }

    public void setStudentid(int studentid) {
        Studentid = studentid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
