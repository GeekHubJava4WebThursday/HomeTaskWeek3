package com.geekhub.hw3.auth;

/**
 * Simple Authentication Class
 */
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

    /**
     * Simple Authentication
     * Check the correctness of the login and password.
     * @param login - String Login
     * @param password - String password
     * @return User
     * @throws AuthException
     */

    private User auth(String login, String password) throws AuthException {

        if (login == null || password == null || login.equals("") || password.equals("")) {
            throw new WrongCredentialsException("Login or password is empty!");
        } else {
            for (int i = 0; i < users.length; i++) {
                if (users[i].getLogin().equals(login)) {
                    if (users[i].getPassword().equals(password)) {
                        System.out.println("Hello, " + login + "!");
                        return users[i];
                    } else throw new WrongPasswrodException("Wrong password for login " + login);
                }
            }
            throw new UserNotFoundException("User login '" + login + " not found");
        }
    }

}
