package com.shawnclake.ui;

import com.shawnclake.auth.User;
import com.shawnclake.auth.UserManager;
import com.shawnclake.io.FileInput;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        FileInput.openFile("src\\com\\shawnclake\\auth\\tests\\file.txt");
        List<String> lines = FileInput.getRemainderOfFile();

        for(String temp : lines)
        {
            System.out.println(temp);
        }

        FileInput.forceCloseFile();


        System.out.println(UserManager.readUser(2).toString());

        //manager.deleteUser(3);



        User user = new User();
        user.setUser(2, "jen", "test123", "test@burger.com", "{}", "{}");

        UserManager.updateUser(user);

    }

}
