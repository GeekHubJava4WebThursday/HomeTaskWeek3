package com.geekhub.hw3.user.exceptions;

public class WrongPasswrodException extends RuntimeException {

    public WrongPasswrodException() {
        super();
    }

    public WrongPasswrodException(String message) {
        super(message);
    }

    public WrongPasswrodException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongPasswrodException(Throwable cause) {
        super(cause);
    }
}
