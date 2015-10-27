package com.geekhub.hw3.auth;

/**
 * Class for WrongCredentialsException
 */
public class WrongCredentialsException extends AuthException{

    public WrongCredentialsException(){
        super();
    }

    public WrongCredentialsException(String exeption){
        super(exeption);
    }

}