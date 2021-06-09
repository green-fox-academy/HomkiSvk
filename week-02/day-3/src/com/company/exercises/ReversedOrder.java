package com.company.exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;

public class ReversedOrder {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt

        Path path = Path.of("reversed-order.txt");

        //creation of the encrypted file for the method to work properly
        try {
            Files.writeString(path, """                            
                    Namespaces are one honking great idea -- let's do more of those!
                    If the implementation is easy to explain, it may be a good idea.
                    If the implementation is hard to explain, it's a bad idea.
                    Although never is often better than *right* now.
                    Now is better than never.
                    Although that way may not be obvious at first unless you're Dutch.
                    There should be one-- and preferably only one --obvious way to do it.
                    In the face of ambiguity, refuse the temptation to guess.
                    Unless explicitly silenced.
                    Errors should never pass silently.
                    Although practicality beats purity.
                    Special cases aren't special enough to break the rules.
                    Readability counts.
                    Sparse is better than dense.
                    Flat is better than nested.
                    Complex is better than complicated.
                    Simple is better than complex.
                    Explicit is better than implicit.
                    Beautiful is better than ugly.
                                        
                    by Tim Peters
                    The Zen of Python""");
        } catch (IOException e) {
            e.printStackTrace();
        }

        reverseOrderText(path);
    }

    private static void reverseOrderText (Path path) {
        LinkedList<String> reveredList = new LinkedList<>();

        try {
            try  (BufferedReader textToReverse = new BufferedReader(new FileReader(path.toFile()))) {
                String line;
                while ((line = textToReverse.readLine()) != null) {
                    reveredList.addFirst(line);
                }
            }
            System.out.println("Content of the file is decrypted.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Files.write(path, reveredList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
