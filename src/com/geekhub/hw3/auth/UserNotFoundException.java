package com.geekhub.hw3.auth;

public class UserNotFoundException extends AuthException {

    public UserNotFoundException() {
        super();
    }

    public UserNotFoundException(String message) {
        super(message);
    }
}
