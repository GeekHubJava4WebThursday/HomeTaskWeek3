package com.geekhub.hw3.auth.exceptions;

/**
 * Created by COMRADE on 24.10.2015.
 */
public class UserNotFoundException extends AuthException {

    public UserNotFoundException() {
        super();
    }

    public UserNotFoundException(String ex) {
        super(ex);
    }
}
