package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
    // Write a function that copies the contents of a file into another file
    // It should take two filenames (string) as parameters:
    //  - path and name of the source file
    //  - path and name of the target file
    // It should return a boolean that shows if the copy was successful

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("I will copy the content of the first file into a new one for you. \n" +
                "What's the path to the file and the name you want to make a copy of?");
        String pathOriginal= scan.next();
        System.out.println("What's the path to the file and the name of a new one?");
        String pathTarget= scan.next();

        System.out.println("Did i create a new copy? : "+ copyFile(pathOriginal,pathTarget));
    }

    private static boolean copyFile(String pathOriginal, String pathTarget) {
        boolean didIDoIt = true;

        try {
            List<String> lines = Files.readAllLines(Path.of(pathOriginal));
            Files.write(Path.of(pathTarget), lines);
        } catch (IOException e) {
            didIDoIt = false;
            System.out.println("Unable to read/write to one of those files.");
        }
        return didIDoIt;

    }
}
