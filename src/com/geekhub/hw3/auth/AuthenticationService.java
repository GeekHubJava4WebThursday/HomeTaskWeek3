package com.geekhub.hw3.auth;

public class AuthenticationService {

    public static void main(String[] args) {
        AuthenticationService authService = new AuthenticationService();

        try {
            User blah = authService.auth("blah", "blah");
            System.out.println("Hello, " + blah.getLogin());
        } catch (AuthException e) {
            System.out.println(e.getMessage());
        }

        try {
            User batman = authService.auth("Batman", "catwoman");
            System.out.println("Hello, " + batman.getLogin());
        } catch (AuthException e) {
            System.out.println(e.getMessage());
        }
    }

    private User[] users = {
        new User("Geekhub", "qwe123"),
        new User("Batman", "catwoman")
    };

    private User auth(String login, String password) throws AuthException {
        if (login.isEmpty() || password.isEmpty()) {
            throw new WrongCredentialsException();
        }

        for (User user : users) {
            if (user.getLogin().equals(login)) {
                if (user.getPassword().equals(password)) {
                    return user;
                }
                throw new WrongPasswordException();
            }
        }
        throw new UserNotFoundException();
    }

    private abstract class AuthException extends Exception {

        public AuthException(String message) {
            super(message);
        }
    }

    public class UserNotFoundException extends AuthException {

        public UserNotFoundException() {
            super("User not found");
        }
    }

    public class WrongCredentialsException extends AuthException {

        public WrongCredentialsException() {
            super("Wrong credentials");
        }
    }

    public class WrongPasswordException extends AuthException {

        public WrongPasswordException() {
            super("Wrong password");
        }
    }
}
