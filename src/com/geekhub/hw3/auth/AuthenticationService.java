package com.geekhub.hw3.auth;

import com.geekhub.hw3.auth.exptions.AuthException;
import com.geekhub.hw3.auth.exptions.UserNotFoundException;
import com.geekhub.hw3.auth.exptions.WrongCredentialsException;
import com.geekhub.hw3.auth.exptions.WrongPasswordException;

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
    }

    private User[] users = {
        new User("Geekhub", "qwe123"),
        new User("Batman", "catwoman")
    };

    private User auth(String login, String password) throws AuthException {

        if(login.isEmpty() || password.isEmpty()) {
            throw new WrongCredentialsException("Password or login is empty");
        }

        for(User user: users) {
            if(login.equals(user.getLogin())) {
                if(password.equals(user.getPassword())) {
                    return user;
                }
                throw new WrongPasswordException("Wrong password");
            }
        }

        throw new UserNotFoundException("User " + login + " not found");
    }
}
