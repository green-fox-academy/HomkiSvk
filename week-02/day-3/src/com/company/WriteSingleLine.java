package com.company;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Scanner;

public class WriteSingleLine {
    // Write a function that is able to manipulate a file
    // by writing your name into it as a single line.
    // The file should be named "my-file.txt".
    // In case the program is unable to write the file,
    // it should print the following error message: "Unable to write file: my-file.txt".

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scan.next();

        writeNameIntoFile(name);

    }

    private static void writeNameIntoFile(String name) {
        Path filePath = Paths.get("my-file.txt");

        try {
            Files.writeString(filePath, name);
        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}