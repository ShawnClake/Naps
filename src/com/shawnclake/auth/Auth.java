package com.shawnclake.auth;

public class Auth {

    public User register(String username, String password, String email)
    {
        User user = new User();
        user.setUser(UserManager.getNextId(), username, password, email, "{}", "{}");
        UserManager.createUser(user);
        return user;
    }



}
