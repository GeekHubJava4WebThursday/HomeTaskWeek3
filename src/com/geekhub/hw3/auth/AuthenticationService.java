package com.geekhub.hw3.auth;

import javax.naming.AuthenticationException;

public class AuthenticationService {

    private User[] users = {
            new User("Geekhub", "qwe123"),
            new User("Batman", "catwoman"),
            new User("Lol", "Iam_lol")
    };

    public static void main(String[] args) {

        AuthenticationService authService = new AuthenticationService();
        // user not found
        try {
            User blah = authService.auth("blah", "blah");
            authService.print(blah);
        } catch (AuthenticationException e) {
            System.out.println(e.getMessage());
        }
        // wrong password
        try {
            User Batman = authService.auth("Batman", "Osborn");
            authService.print(Batman);
        } catch (AuthenticationException e) {
            System.out.println(e.getMessage());
        }
        // wrong login
        try {
            User Lol = authService.auth("Git", "qwe123");
            authService.print(Lol);
        } catch (AuthenticationException e) {
            System.out.println(e.getMessage());
        }
        //
        try {
            User batman = authService.auth("Batman", "catwoman");
            authService.print(batman);
        } catch (AuthenticationException e) {
            System.out.println(e.getMessage());
        }
    }

    private User auth(String login, String password) throws AuthenticationException {
        //TODO: Implement me
        boolean log = false;
        boolean pass = false;

        for (int i = 0; i < users.length; i++) {
            if (users[i].getLogin().equals(login) && users[i].getPassword().equals(password)) {
                return users[i];
            } else if (users[i].getLogin().equals(login)) {
                log = true;
                //break;
            } else if (users[i].getPassword().equals(password)) {
                pass = true;
                //break;
            }
        }
        // throws exception
        if (log) {
            throw new AuthenticationException("For \"" + login + "\" wrong password!");
        } else if (pass) {
            throw new AuthenticationException("For password \"" + password + "\" wrong login!");
        } else {
            throw new AuthenticationException("User " + login + " not found!");
        }
    }

    private void print(User user) {
        System.out.print("User { ");
        System.out.print("Login : " + user.getLogin() + " - Password : " + user.getPassword() + " }\n");
    }
}