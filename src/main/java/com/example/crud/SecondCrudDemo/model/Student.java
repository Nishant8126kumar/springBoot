package com.example.crud.SecondCrudDemo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student_details")
public class Student {

    @Id
    @Column(name = "student_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "student_name")
    private String name;

    @Column(name = "student_address")
    private String address;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Cetrtificate> cetrtificate;

    public List<Cetrtificate> getCetrtificate() {
        return cetrtificate;
    }

    public void setCetrtificate(List<Cetrtificate> cetrtificate) {
        this.cetrtificate = cetrtificate;
    }

    public Student() {
    }

    public Student(int id, String name, String address, List<Cetrtificate> cetrtificate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.cetrtificate = cetrtificate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", cetrtificate=" + cetrtificate +
                '}';
    }
}
