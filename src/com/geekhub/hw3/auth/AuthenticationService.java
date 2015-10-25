package com.geekhub.hw3.auth;

public class AuthenticationService {

    public static void main(String[] args) {
        AuthenticationService authService = new AuthenticationService();

        try {
            User blah = authService.auth("bb", null);
            authVoice(blah);
        } catch (AuthException e) {
            System.err.println(e);
        }

        try {
            User batman = authService.auth("Batman", "catwoman");
            authVoice(batman);
        } catch (AuthException e) {
            System.err.println(e);
        }
        try {
            User batman = authService.auth("Geekhub", "qwe123");
            authVoice(batman);
        } catch (AuthException e) {
            System.err.println(e);
        }

    }

    private User[] users = {
            new User("Geekhub", "qwe123"),
            new User("Batman", "catwoman")
    };

    private static void authVoice(User user){
        System.out.println("Hello "+user.getLogin()+"!!!");
    }

    private User auth(String login, String password) throws AuthException {
        if (login==null ||password==null || login.isEmpty() || password.isEmpty()  ) {
            throw new WrongCredentialsException("Login or password is empty!");
        } else {
            for (int i = 0; i < users.length; i++) {
                if (users[i].getLogin().equals(login)) {
                    if (users[i].getPassword().equals(password)) {
                        return users[i];
                    }else throw new WrongPasswrodException("Wrong password");
                }


            }
            throw new UserNotFoundException("User not found");
        }
    }
}

