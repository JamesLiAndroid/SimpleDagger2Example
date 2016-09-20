package com.james.li.simpledagger2example.bean;

/**
 * Created by jyj-lsy on 9/20/16 in zsl-tech.
 */
public class UserModule {
    String username;
    String role;
    String home;

    public UserModule() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return "UserModule{" +
                "username='" + username + '\'' +
                ", role='" + role + '\'' +
                ", home='" + home + '\'' +
                '}';
    }
}
