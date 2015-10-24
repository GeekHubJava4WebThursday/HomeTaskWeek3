package com.geekhub.hw3.auth;

import com.sun.istack.internal.NotNull;

public class User {
    private String name;
    private String surname;
    private String login;
    private String passwordMd5;

    public User(@NotNull String name,
                @NotNull String surname,
                @NotNull String login,
                @NotNull String passwordMd5) {
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.passwordMd5 = passwordMd5;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLogin() {
        return login;
    }

    public String getPasswordMd5() {
        return passwordMd5;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", login='" + login + '\'' +
                ", passwordMd5='" + passwordMd5 + '\'' +
                '}';
    }

}
