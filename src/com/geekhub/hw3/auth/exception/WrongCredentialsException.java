package com.geekhub.hw3.auth.exception;

public class WrongCredentialsException extends AuthException {
    public WrongCredentialsException(String message) {
        super(message);
    }
}
