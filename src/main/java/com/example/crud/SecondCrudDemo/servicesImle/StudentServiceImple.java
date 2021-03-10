package com.example.crud.SecondCrudDemo.servicesImle;

import com.example.crud.SecondCrudDemo.model.Cetrtificate;
import com.example.crud.SecondCrudDemo.model.Student;
import com.example.crud.SecondCrudDemo.repository.CertificateRepository;
import com.example.crud.SecondCrudDemo.repository.StudentRepository;
import com.example.crud.SecondCrudDemo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImple implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    CertificateRepository certificateRepository;

    public void createStudent() {
        /**---For OneToMany Use Unidirectional---**/
//        Student student = new Student();
//        Cetrtificate cetrtificate = new Cetrtificate();
//        Cetrtificate cetrtificate2 = new Cetrtificate();
//
//        List<Cetrtificate> cetrtificateList = new ArrayList<Cetrtificate>();
//        cetrtificate.setCourseName("Java");
//        cetrtificate2.setCourseName("Node.js");
//        student.setName("Aman sharma");
//        student.setAddress("Aligarh");
//        cetrtificateList.add(cetrtificate);
//        cetrtificateList.add(cetrtificate2);
//        student.setCetrtificate(cetrtificateList);
//        studentRepository.save(student);

        /***---Fro ManyToOne Use bidirectional----***/
        Cetrtificate cetrtificate1 = new Cetrtificate();
        Cetrtificate certificate2 = new Cetrtificate();
        cetrtificate1.setCourseName("python");
        certificate2.setCourseName("C");
        Student student = new Student();
        student.setName("rama kumar");
        cetrtificate1.setStudent(student);
        certificate2.setStudent(student);
        List<Cetrtificate> cetrtificateList = new ArrayList<>();
        cetrtificateList.add(cetrtificate1);
        cetrtificateList.add(certificate2);
        certificateRepository.saveAll(cetrtificateList);

    }

    @Override
    public List<Student> getAllStudentRecord() {
        return studentRepository.findAll();
    }
}
