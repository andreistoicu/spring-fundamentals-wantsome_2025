package com.wantsome.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(NoEmployeesException.class)
    public ResponseEntity handleNoEmployeesException(){

        ExceptionMessage message = new ExceptionMessage(404,
                "NoEmployeesException",
                "No employees are hired");

        return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
    }

    public ResponseEntity handleGlobalException(Exception exception){
        ExceptionMessage message = new ExceptionMessage(500,
                "An unknown exception",
                exception.getMessage());
        return new ResponseEntity<>(message,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
