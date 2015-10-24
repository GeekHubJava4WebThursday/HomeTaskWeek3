package com.geekhub.hw3.auth.exceptions;

/**
 * Created by COMRADE on 24.10.2015.
 */
public class WrongPasswrodException extends AuthException {

    public WrongPasswrodException() {
        super();
    }

    public WrongPasswrodException(String ex) {
        super(ex);
    }
}
