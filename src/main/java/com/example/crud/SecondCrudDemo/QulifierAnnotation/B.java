package com.example.crud.SecondCrudDemo.QulifierAnnotation;

import org.springframework.stereotype.Component;
@Component("B class")
public class B implements A{
    @Override
    public void display() {
        System.out.println("From A class");
    }
}
