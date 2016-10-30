/**
 * FileInput
 * Used for easy file input
 * Author: Shawn Clake
 * Maintainer: Shawn Clake
 * https://github.com/ShawnClake
 * Originally created for use in the 'Unprecedented Project'
 * Covered under the GNU license
*/

package com.shawnclake.io;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class FileInput {

    private static String path;
    private static Scanner file;

    private FileInput(String filePath)
    {
        path = filePath;
        openFileIn();
    }

    public static boolean openFile(String filePath)
    {
        path = filePath;
        return openFileIn();
    }

    public static String readLine()
    {
        if(file.hasNextLine())
            return file.nextLine();
        return "";
    }

    public static List<String> getEntireFile() throws IOException
    {
        Path filepath = FileSystems.getDefault().getPath(path);
        return Files.readAllLines(filepath, Charset.defaultCharset());
    }

    public static List<String> getRemainderOfFile()
    {

        List<String> lines = new ArrayList<>();

        while (file.hasNextLine()) {
            String line = file.nextLine();
            lines.add(line);
        }

        return lines;
    }

    public static void forceCloseFile()
    {
        file.close();
    }

    private static boolean openFileIn()
    {
        try {

            file = new Scanner(Paths.get(path));

        }
        catch (IOException e) {

            e.printStackTrace();

            return false;

        }

        return true;
    }

}