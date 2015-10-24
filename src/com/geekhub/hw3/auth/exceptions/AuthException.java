package com.geekhub.hw3.auth.exceptions;

/**
 * Created by COMRADE on 24.10.2015.
 */
public class AuthException extends Exception {

    AuthException(){
        super();
    }

    AuthException(String ex){
        super(ex);
    }

}
