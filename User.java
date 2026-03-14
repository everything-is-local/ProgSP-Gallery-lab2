package com.snytkov.lab2;

public class User {
    private String accessMode;
    private String login;
    private String password;

    public User(String accessMode, String login, String password) {
        this.accessMode = accessMode;
        this.login = login;
        this.password = password;
    }

    public String getAccessMode() {
        return accessMode;
    }

    void setAccessMode(String accessMode) {
        this.accessMode = accessMode;
    }

    public String getLogin() {
        return login;
    }

    void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    void setPassword(String password) {
        this.password = password;
    }
}
