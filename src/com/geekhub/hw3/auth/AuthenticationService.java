package com.geekhub.hw3.auth;

import com.geekhub.hw3.auth.authexceptions.*;
import java.lang.Comparable;

public class AuthenticationService {

    public static void main(String[] args) {
        AuthenticationService authService = new AuthenticationService();

        try {
            User blah = authService.auth("blah", "blah");
        } catch (AuthException e) {
            e.printStackTrace();
        }

        try {
            User batman = authService.auth("Batman", "catwoman");
        } catch (AuthException e) {
            e.printStackTrace();
        }
    }

    private User[] users = {
        new User("Geekhub", "qwe123"),
        new User("Batman", "catwoman")
    };

    private User auth(String login, String password) throws AuthException {
        if(login.length()==0 | password.length()==0) {
            throw new WrongCredentialsException("Please provide a login and a password");
        }
        else {
            for(User usr: users)
            {
                //Doesn't seem to work, neither does equals method. Always returns false for some reason.
                if(usr.getLogin().compareTo(login)==0){
                    if(usr.getPassword().equals(password))
                        System.out.println("User " + login + " signed in" );
                    else
                        throw new WrongPasswrodException("The password you entered is incorrect");
                }
                else
                    throw new UserNotFoundException("The username you entered is incorrect");
            }
        }
        return null;
    }
}
