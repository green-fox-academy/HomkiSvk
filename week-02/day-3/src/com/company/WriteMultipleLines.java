package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class WriteMultipleLines {
    // Create a function that takes 3 parameters: a path, a word and a number
    // and is able to write into a file.
    // - The path parameter should be a string that describes the location (path & name)
    //    of the file you wish to modify.
    // - The word parameter should also be a string that will be written to the file as individual lines.
    // - The number parameter should describe how many lines the file should have.

    // If the word is 'apple' and the number is 5, it should write 5 lines
    // into the file and each line should read 'apple'.
    // The function should not raise any errors if it could not write the file.

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("What's the path to the file?");
        String path = scan.next();
        System.out.println("What text should i put there?");
        String text = scan.next();
        System.out.println("How many lines of it?");
        int lines = scan.nextInt();
        //while loop for asking number lines>0

        writeMoreLinesIntoFile(path, text, lines);
    }

    public static void writeMoreLinesIntoFile(String path, String text, int lines) {
        Path filePath = Paths.get(path);
        //not taken care of if lines <=0
        try {
            Files.writeString(filePath, text+ " \n"); // clears the file and starts the new one
            for (int i = 1; i < lines; i++) {
                Files.writeString(filePath, text+ " \n", StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }


}
