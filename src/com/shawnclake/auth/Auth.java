package com.shawnclake.auth;

import com.shawnclake.io.FileInput;

import java.security.MessageDigest;

import java.util.List;

public class Auth {

    public User register(String username, String password, String email)
    {
        User user = new User();
        user.setUser(UserManager.getNextId(), username, password, email, "{}", "{}");
        UserManager.createUser(user);
        return user;
    }

    public User login(String username, String password)
    {
        FileInput.openFile("src\\com\\shawnclake\\auth\\tests\\file.txt");
        List<String> lines = FileInput.getRemainderOfFile();

        User user = new User();

        int i =0;
        for(; i < lines.size(); i++)
        {
            String[] fields = lines.get(i).split("-");
            if(username.equals(fields[1]) && password.equals(fields[2]))
                return UserManager.readUser(Integer.parseInt(fields[0]));

        }

        return user;
    }

    public User user()
    {
        return new User();
    }

    /*public String hash(String hashable)
    {
        MessageDigest md =  MessageDigest.getInstance("MD5");
        byte[] digest =  md.digest(hashable.getBytes());
        return new String(digest);
    }*/

    public void logout()
    {
        
    }

}


