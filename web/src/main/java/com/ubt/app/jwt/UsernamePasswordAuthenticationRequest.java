package com.ubt.app.jwt;


public class UsernamePasswordAuthenticationRequest {

    private String username;
    private String password;

    public UsernamePasswordAuthenticationRequest() {
    }

    public String getUsername() {
        System.out.println("UsernamePasswordAuthRequest- getUsername(): "+username);
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
