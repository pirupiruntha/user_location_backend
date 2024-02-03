package com.piruntha.userlocation.exception;

import com.piruntha.userlocation.common.StatusCode;

public class UserLocationException extends RuntimeException{
    private StatusCode statusCode;
    private String message;
    public UserLocationException(String message, StatusCode statusCode) {
        this.statusCode = statusCode;
        this.message =message;
    }

    public UserLocationException(String message ) {
        this.message= message;
    }
}
