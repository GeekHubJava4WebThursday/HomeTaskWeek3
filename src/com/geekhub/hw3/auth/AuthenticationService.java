package com.geekhub.hw3.auth;

import com.geekhub.hw3.auth.exceptions.*;

public class AuthenticationService {



    public static void main(String[] args) {
        AuthenticationService authService = new AuthenticationService();

        try {
            User blah = authService.auth("blah", "blah1234");
        } catch (AuthException e) {
            //TODO: react
            e.printStackTrace();
        }

        try {
            User batman = authService.auth("Batman", "catwoman");
        } catch (AuthException e) {
            //TODO: react
            e.printStackTrace();
        }
    }

    private User[] users = {
            new User("Geekhub", "qwe123"),
            new User("Batman", "catwoman")
    };

    private User auth(String login, String password) throws AuthException {
        //TODO: Implement me
        if(checkLength(login, password)){
            for (User us : users){
                if(us.getLogin().equals(login)){
                    if(us.getPassword().equals(password)){
                        System.out.println("Welcome, " + login + "!");
                        return us;
                    }else{
                        throw new WrongPasswrodException("Password incorrect!");
                    }
                }
            }

            throw new UserNotFoundException("User not found!");
        }
        return null;
    }


    public boolean checkLength(String login, String password) throws AuthException {
        boolean checker = false;
        if(login.length() == 0 | password.length() == 0){
            throw new WrongCredentialsException("The field is not filled!");
        }else{
            checker = true;
        }
        return checker;
    }

}
