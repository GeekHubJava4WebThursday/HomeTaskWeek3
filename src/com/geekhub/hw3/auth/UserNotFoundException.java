package com.geekhub.hw3.auth;

/**
 * Class for UserNotFoundException
 */
public class UserNotFoundException extends AuthException{

    public UserNotFoundException(){
        super();
    }

    public UserNotFoundException(String exeption){
        super(exeption);
    }

}