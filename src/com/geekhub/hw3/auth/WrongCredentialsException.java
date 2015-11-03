package com.geekhub.hw3.auth;

/**
 * Created by developer on 02.11.2015.
 */
public class WrongCredentialsException extends Exception {
    public WrongCredentialsException(String message){
        super(message);
    }
}
