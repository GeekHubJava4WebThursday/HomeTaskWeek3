package com.geekhub.hw3.auth.exptions;

public class WrongCredentialsException extends AuthException {
    public WrongCredentialsException(String message) {
        super(message);
    }
}
