package com.geekhub.hw3.auth;

public class AuthenticationService {

    public static void main(String[] args) {
        AuthenticationService authService = new AuthenticationService();

        try {
            User blah = authService.auth("blah", "blah");
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
       User user = getUserByLogin(login);
            if (user == null) {
                throw new UserNotFoundException();
            }

            if (user.getPassword() != password) {
                throw new WrongPasswordException();
            }

             if (user.getPassword().isEmpty() && user.getLogin().isEmpty()){
                 throw new WrongCredentialsException();
             }


        return user;
    }

    private User getUserByLogin(String login){

        for (int i = 0; i < users.length; i++) {
            if (login == users[i].getLogin())
                return users[i];
        }

        return null;
    }
}
