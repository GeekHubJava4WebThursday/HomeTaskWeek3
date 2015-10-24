package com.geekhub.hw3.auth;

public class AuthenticationService {

    public static void main(String[] args) {
        AuthenticationService authService = new AuthenticationService();

        try {
            User blah = authService.auth("blah", "blah");
        } catch (AuthException e) {
            System.out.println(e.getMessage());
        }

        try {
            User batman = authService.auth("Batman", "catwoman");
        } catch (AuthException e) {
            System.out.println(e.getMessage());
        }

        try {
            User anna = authService.auth("Anna", "65432");
        } catch (AuthException e) {
            System.out.println(e.getMessage());
        }

        try {
            User noName = authService.auth("", "qwe");
        } catch (AuthException e) {
            System.out.println(e.getMessage());
        }
    }

    private User[] users = {
        new User("Geekhub", "qwe123"),
        new User("Batman", "catwoman"),
        new User("Anna", "654321")
    };

    private User auth(String login, String password) throws AuthException {

        if (login.equals("") || password.equals("")) {
            throw new WrongCredentialsException("Login and password must not be empty");
        }

        for (User user : users) {
            if (user.getLogin().equals(login)) {
                if (user.getPassword().equals(password)) {
                    System.out.println("User \"" + login + "\" logged in successfully");
                    return user;
                }
                else {
                    throw new WrongPasswrodException("User \"" + login + "\" entered the wrong password");
                }
            }
        }

        throw new UserNotFoundException("There is no registered user with login \"" + login + "\"");
    }
}
