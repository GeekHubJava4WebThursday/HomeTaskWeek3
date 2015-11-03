package com.geekhub.hw3.auth;

/**
 * Immutable User representation (all fields are final)
 */
public class User {
    private final String login;
    private final String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {

        return login;
    }

    public String getPassword() {

        return password;
    }
}
