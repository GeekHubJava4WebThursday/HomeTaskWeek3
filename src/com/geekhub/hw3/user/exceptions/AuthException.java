package com.geekhub.hw3.user.exceptions;

public class AuthException extends Exception {

    public AuthException() {
        super();
    }

    public AuthException(String message, Throwable cause) {
        super(message, cause);
    }

    public AuthException(String message) {
        super(message);
    }

    public AuthException(Throwable cause) {
        super(cause);
    }
}
