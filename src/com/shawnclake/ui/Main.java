package com.shawnclake.ui;

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
    }

}
