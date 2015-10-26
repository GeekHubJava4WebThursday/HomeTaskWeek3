package com.geekhub.hw3.auth.authexceptions;

/**
 * Created by ִלטענטי on 26.10.2015.
 */
public class WrongCredentialsException extends AuthException {

    public WrongCredentialsException() {
        super();
    }

    public WrongCredentialsException(String exception){
        super(exception);
    }
}
