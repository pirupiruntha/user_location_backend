package com.piruntha.userlocation.exception;

public class UserLocationException extends RuntimeException{
    private int statusCode;
    private String message;
    public UserLocationException(String message, int statusCode) {
        this.statusCode = statusCode;
        this.message =message;
    }

    public UserLocationException(String message ) {
        this.message= message;
    }
}
