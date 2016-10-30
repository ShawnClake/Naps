package com.shawnclake.auth;

import com.shawnclake.io.FileInput;

import java.util.List;

public class UserManager {

    public void createUser(User user)
    {

    }

    public User readUser(int id)
    {

        User user = new User();

        FileInput.openFile("src\\com\\shawnclake\\auth\\tests\\file.txt");
        List<String> lines = FileInput.getRemainderOfFile();

        for(String line : lines)
        {
            String[] fields = line.split("|");
            if(Integer.parseInt(fields[0]) == id)
            {
                user.setUser(Integer.parseInt(fields[0]), fields[1], fields[2], fields[3], fields[4], fields[5]);
            }
        }

        return user;
    }

    public void updateUser(User user)
    {

    }

    public void deleteUser(int id)
    {

    }

}
