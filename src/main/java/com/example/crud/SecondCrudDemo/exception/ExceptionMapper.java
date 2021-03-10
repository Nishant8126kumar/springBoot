package com.example.crud.SecondCrudDemo.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ExceptionMapper {

    @ExceptionHandler(value = DatabaseException.class)
    public ResponseEntity<?> handleDataBaseException(DatabaseException databaseException) {
        Map<String, Object> response = new HashMap<>();
        response.put("error", databaseException.getMessage());
        response.put("data", null);
        return new ResponseEntity<>(response, HttpStatus.NOT_ACCEPTABLE);
    }
}
