package com.geekhub.hw3.auth;

/**
 * Created by developer on 02.11.2015.
 */
public class WrongPasswrodException extends AuthException {
    public WrongPasswrodException(String message){
        super(message);
    }
}
