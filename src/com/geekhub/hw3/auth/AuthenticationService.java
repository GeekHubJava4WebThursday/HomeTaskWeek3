package com.geekhub.hw3.auth;

import com.geekhub.hw3.auth.exceptions.AuthException;
import com.geekhub.hw3.auth.exceptions.UserNotFoundException;
import com.geekhub.hw3.auth.exceptions.WrongCredentialsException;
import com.geekhub.hw3.auth.exceptions.WrongPasswordException;

public class AuthenticationService {

    private User[] users = {
            new User("Geekhub", "qwe123"),
            new User("Batman", "catwoman")
    };

    public static void main(String[] args) {
        AuthenticationService authService = new AuthenticationService();

        try {
            User blah = authService.auth("blah", "blah");
        } catch (AuthException e) {
            System.out.println(e.toString());
        }

        try {
            User batman = authService.auth("Batman", "catwoman");
        } catch (AuthException e) {
            System.out.println(e.toString());
        }

        try {
            User fake = authService.auth("", "");
        } catch (AuthException e) {
            System.out.println(e.toString());
        }
        try {
            User fakePassword = authService.auth("Geekhub", "adrfh");
        } catch (AuthException e) {
            System.out.println(e.toString());
        }

        /*Output
        com.geekhub.hw3.auth.exceptions.UserNotFoundException: User not found
        com.geekhub.hw3.auth.exceptions.WrongCredentialsException: empty lines
        com.geekhub.hw3.auth.exceptions.WrongPasswordException: Wrong password
        */
    }

    private User auth(String login, String password) throws AuthException {
        if (login.equals("") && password.equals("")) {
            throw new WrongCredentialsException("Empty lines");
        }
        User user = findUser(login);
        if (user == null) {
            throw new UserNotFoundException("User not found");
        } else if (!user.getPassword().equals(password)) {
            throw new WrongPasswordException("Wrong password");
        }
        return user;
    }


    public User findUser(String login) {
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        return null;
    }

}
