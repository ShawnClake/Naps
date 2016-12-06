package com.shawnclake.auth;

import java.util.ArrayList;

public class UserGroup {

    private ArrayList<User> users;

    public UserGroup()
    {
        this.users = new ArrayList<User>();
    }

    public void addUser(User user)
    {
        this.users.add(user);
    }

    public boolean isInGroup(User user)
    {
        return users.contains(user);
    }

    public User removeUser(User user)
    {
        users.remove(user);
        return user;
    }

    public ArrayList<User> getUsers()
    {
        return this.users;
    }




}
