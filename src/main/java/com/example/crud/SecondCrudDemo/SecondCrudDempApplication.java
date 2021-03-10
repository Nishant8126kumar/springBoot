package com.example.crud.SecondCrudDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecondCrudDempApplication {
    private static final Logger logger = LoggerFactory.getLogger(SecondCrudDempApplication.class);


    public static void main(String[] args) {
        logger.info("this in initial log");
        logger.info("Log before starts Application");
        SpringApplication.run(SecondCrudDempApplication.class, args);
        logger.info("Log after starts Application");
    }

}
