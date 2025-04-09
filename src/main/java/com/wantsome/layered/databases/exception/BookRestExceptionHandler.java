package com.wantsome.layered.databases.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BookRestExceptionHandler {

    @ExceptionHandler(NoBookFoundException.class)
    public ResponseEntity handleNoBookFoundException (){
        BookExceptionMessage bookExceptionMessage = new BookExceptionMessage(404,
                "not found",
                "Book not found");

        return new ResponseEntity(bookExceptionMessage, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(AnotherException.class)
    public ResponseEntity handleAnotherException (){
        BookExceptionMessage bookExceptionMessage = new BookExceptionMessage(409,
                "conflict",
                "there is a conflict when deleting the book");

        return new ResponseEntity(bookExceptionMessage, HttpStatus.VARIANT_ALSO_NEGOTIATES);
    }
}
