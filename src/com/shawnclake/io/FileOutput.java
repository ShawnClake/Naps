package com.shawnclake.io;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public final class FileOutput {

    private static String path;

    public static void writeFile(String filePath, List<String> lines)
    {
        path = filePath;
        Path file = Paths.get(path);
        try
        {
            Files.write(file, lines, Charset.forName("UTF-8"));
        } catch(Exception e) {
            System.out.println("File write error");
        }

    }

}
