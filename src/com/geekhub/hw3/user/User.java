package com.geekhub.hw3.user;

public class User implements Comparable {

    private String login;
    private String password;

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

    /**
     * Compares users login and password
     * @param o User to compare
     * @return User comparison result status: 0 - equals, 1 - login mismatch, 2 - password mismatch
     */
    @Override
    public int compareTo(Object o) {
        if (o == null) {
            throw new NullPointerException("User object is null!");
        }
        User anotherUser = (User) o;
        if (anotherUser.login.compareTo(this.login) != 0) {
            return 1;
        }
        if (anotherUser.password.compareTo(this.password) != 0) {
            return 2;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
