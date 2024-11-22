package com.lxisoft.hackathon.exception;

public class SeriouslyWrongException extends RuntimeException {
    public SeriouslyWrongException(String message){
        System.out.println("Error");        
        super(message);
    }
}
