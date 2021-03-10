package com.example.crud.SecondCrudDemo.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
//@Table(name = "student_certificate")
public class Cetrtificate {

    @Id
    @Column(name = "certi_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String courseName;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Student student;

    public void setId(long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Cetrtificate() {
    }

    public Cetrtificate(long id, String courseName, Student student) {
        this.id = id;
        this.courseName = courseName;
        this.student = student;
    }

    public long getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Cetrtificate{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
