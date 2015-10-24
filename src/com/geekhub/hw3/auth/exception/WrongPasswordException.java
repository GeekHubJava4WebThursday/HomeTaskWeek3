package com.geekhub.hw3.auth.exception;

public class WrongPasswordException extends AuthException {
    public WrongPasswordException(String message) {
        super(message);
    }
}
