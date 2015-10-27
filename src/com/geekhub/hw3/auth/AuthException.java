package com.geekhub.hw3.auth;

/**
 * Class for AuthException
 */
public class AuthException extends Exception{
    AuthException(){
        super();
    }

    AuthException(String exception){
    super(exception);
    }
}
