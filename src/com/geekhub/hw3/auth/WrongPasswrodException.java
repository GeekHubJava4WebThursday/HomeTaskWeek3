package com.geekhub.hw3.auth;

public class WrongPasswrodException extends AuthException {

    public WrongPasswrodException() {
        super();
    }

    public WrongPasswrodException(String message) {
        super(message);
    }
}
