package com.company.exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;

public class Logs {
    // Read all data from 'log.txt'
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses
    // Write a function that returns the GET / POST request ratio

    public static void main(String[] args) {
        Path path = Path.of("log.txt");

        //i know im doing it twice :D wanted to just check if it is working
        System.out.println("Here is list of "+listIP(path).size()+ " unique IP adresses: \n" +listIP(path)+ "\n");

        System.out.println("GET to POST ratio is: " +getPostRatio(path));

    }

    private static ArrayList<String> listIP(Path path) {
        var ips = new ArrayList<String>();

        try {
            try  (BufferedReader textToReverse = new BufferedReader(new FileReader(path.toFile()))) {
                String line;
                while ((line = textToReverse.readLine()) != null) {
                    String[] getIp = line.split(" {3}");
                    if (!ips.contains(getIp[1])){
                        ips.add(getIp[1]);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ips;
    }

    private static double getPostRatio(Path path) {
        int getCount = 0 ;
        int postCount = 0 ;
        try {
            try  (BufferedReader textToReverse = new BufferedReader(new FileReader(path.toFile()))) {
                String line;
                while ((line = textToReverse.readLine()) != null) {
                    String[] getIp = line.split(" {3}");
                    if (getIp[2].equals("GET /")){
                        getCount++;
                    }
                    else if (getIp[2].equals("POST /")){
                        postCount++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (double) getCount/postCount;
    }
}
