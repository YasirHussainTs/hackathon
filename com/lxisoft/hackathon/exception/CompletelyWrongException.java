package com.lxisoft.hackathon.exception;

public class CompletelyWrongException extends RuntimeException {
    public void CompletelyWrongException(String message) {
        System.out.println("Error");
        super(message);
    }
}
