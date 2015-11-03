package com.geekhub.hw3.auth;

/**
 * Created by developer on 02.11.2015.
 */
public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message){
        super(message);
    }
}
