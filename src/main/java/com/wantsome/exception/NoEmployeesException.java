package com.wantsome.exception;

public class NoEmployeesException extends RuntimeException {
    public NoEmployeesException(String message) {
        super(message);
    }
}
