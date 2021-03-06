package com.shawnclake.auth;

import com.shawnclake.io.FileInput;
import com.shawnclake.io.FileOutput;

import java.util.List;

public class UserManager {

    public static void createUser(User user)
    {

        FileInput.openFile("src\\com\\shawnclake\\auth\\tests\\file.txt");
        List<String> lines = FileInput.getRemainderOfFile();
        FileInput.forceCloseFile();


        lines.add(user.toString());
        FileOutput.writeFile("src\\com\\shawnclake\\auth\\tests\\file.txt", lines);

    }

    public static User readUser(int id)
    {

        User user = new User();

        FileInput.openFile("src\\com\\shawnclake\\auth\\tests\\file.txt");
        List<String> lines = FileInput.getRemainderOfFile();

        for(String line : lines)
        {
            String[] fields = line.split("-");
            if(Integer.parseInt(fields[0]) == id)
            {
                user.setUser(Integer.parseInt(fields[0]), fields[1], fields[2], fields[3], fields[4], fields[5]);
            }
        }

        FileInput.forceCloseFile();

        return user;
    }

    public static void updateUser(User user)
    {
        FileInput.openFile("src\\com\\shawnclake\\auth\\tests\\file.txt");
        List<String> lines = FileInput.getRemainderOfFile();

        int i =0;
        for(; i < lines.size(); i++)
        {
            String[] fields = lines.get(i).split("-");
            if(Integer.parseInt(fields[0]) == user.getId())
                break;

        }

        FileInput.forceCloseFile();

        lines.set(i, user.toString());

        FileOutput.writeFile("src\\com\\shawnclake\\auth\\tests\\file.txt", lines);
    }

    public static void deleteUser(int id)
    {
        FileInput.openFile("src\\com\\shawnclake\\auth\\tests\\file.txt");
        List<String> lines = FileInput.getRemainderOfFile();

        int i =0;
        for(; i < lines.size(); i++)
        {
            String[] fields = lines.get(i).split("-");
            if(Integer.parseInt(fields[0]) == id)
                break;

        }

        FileInput.forceCloseFile();

        lines.remove(i);

        FileOutput.writeFile("src\\com\\shawnclake\\auth\\tests\\file.txt", lines);
    }

    public static int getNextId()
    {
        FileInput.openFile("src\\com\\shawnclake\\auth\\tests\\file.txt");
        List<String> lines = FileInput.getRemainderOfFile();

        int id = 0;
        for(int i = 0; i < lines.size(); i++)
        {
            String[] fields = lines.get(i).split("-");
            id = Integer.parseInt(fields[0]);
        }

        FileInput.forceCloseFile();

        return id;
    }

}
