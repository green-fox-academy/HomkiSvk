package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    // Write a function that takes a filename as string as a parameter
    // and returns the number of lines the file contains.
    // It should return zero if it can't open the file
    // and should not raise any error.

    public static void main(String[] args) {
        Path filePath = Paths.get("my-file.txt");
        try {
            List<String> lines = Files.readAllLines(filePath);
            int count=0;
            for (String i:lines ) {
                count++;
            }
            System.out.println(count);
        } catch (IOException e) {
            System.out.println("0");
        }

    }
}
