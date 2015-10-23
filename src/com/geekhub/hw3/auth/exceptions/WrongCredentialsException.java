package com.geekhub.hw3.auth.exceptions;


public class WrongCredentialsException extends AuthException {
    public WrongCredentialsException(String message) {
        super(message);
    }
}
