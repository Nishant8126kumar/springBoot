package com.example.crud.SecondCrudDemo.controllers;


import com.example.crud.SecondCrudDemo.repository.StudentRepository;
import com.example.crud.SecondCrudDemo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;
    @Autowired
    StudentRepository studentRepository;

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createStudent() {
        studentService.createStudent();
        return new ResponseEntity(HttpStatus.OK);
    }


    @GetMapping("/record")
    public ResponseEntity<?> getStudent() {
        return new ResponseEntity(studentRepository.getByJoin(), HttpStatus.OK);
    }

    @GetMapping("/selfJoin")
    public ResponseEntity<?> selfJoinStudent() {
        return new ResponseEntity(studentRepository.selfJoin(), HttpStatus.OK);
    }

    @GetMapping("/outerjoin")
    public ResponseEntity<?> outerJoinStudent() {
        return new ResponseEntity(studentRepository.getByJoinOuter(), HttpStatus.OK);
    }
}
