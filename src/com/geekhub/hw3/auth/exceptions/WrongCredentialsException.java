package com.geekhub.hw3.auth.exceptions;

/**
 * Created by COMRADE on 24.10.2015.
 */
public class WrongCredentialsException extends AuthException {

    public WrongCredentialsException() {
        super();
    }

    public WrongCredentialsException(String ex) {
        super(ex);
    }
}
