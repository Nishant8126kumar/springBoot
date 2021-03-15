package com.example.crud.SecondCrudDemo.QulifierAnnotation;

import org.springframework.stereotype.Component;

@Component("mailClass")
public class Mail implements A {
    @Override
    public void display() {
        System.out.println("From Mail class");
    }
}
