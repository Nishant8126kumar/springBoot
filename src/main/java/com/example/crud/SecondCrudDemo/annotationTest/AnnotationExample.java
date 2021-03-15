package com.example.crud.SecondCrudDemo.annotationTest;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Phone {
    float version() default 1;

    String os() default "linux";
}

class Mobile {

}

public class AnnotationExample {
}
