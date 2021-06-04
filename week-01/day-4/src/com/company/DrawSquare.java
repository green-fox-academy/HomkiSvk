package com.company;

import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%%
        // %    %
        // %    %
        // %    %
        // %    %
        // %%%%%%
        //
        // The square should have as many lines as the number was

        Scanner scan = new Scanner(System.in);

        System.out.println("How big square u want to see? Give me a number:");
        int size = scan.nextInt();

        for (int i = 0; i < size; i++) {
            if (i==0 || i==size-1) {
                for (int j = 0; j < size; j++) {
                    System.out.print('%');
                }
                System.out.println();
            } else {
                System.out.print('%');
                for (int j = 0; j < size-2; j++) {
                    System.out.print(' ');
                }
                System.out.println('%');
            }
        }
    }
}
