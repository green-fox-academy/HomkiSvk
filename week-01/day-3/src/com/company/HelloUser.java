package com.company;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet the User instead of the World!
        // The program should ask for the name of the User
        //System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello, "+name+"!m");


    }
}

