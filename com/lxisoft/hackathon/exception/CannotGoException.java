
package com.lxisoft.hackathon.exception;



public class CannotGoException extends RuntimeException {
    public CannotGoException(String message) {
        System.out.println("Error") ;
        super(message);
    }
}
