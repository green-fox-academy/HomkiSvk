package com.company;

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        Scanner scan = new Scanner(System.in);

        System.out.println("How big diamond u want to see? Give me a number:");
        int size = scan.nextInt();

        // my first solution

        /*
        int spaces = size-1;
        int signs = 1;

        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(' ');
            }
            spaces--;
            for (int k = 0; k < signs; k++) {
                System.out.print('*');
            }
            signs+=2;
            System.out.println();
        }
        spaces+=2;
        signs-=4;
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(' ');
            }
            spaces++;
            for (int k = 0; k < signs; k++) {
                System.out.print('*');
            }
            signs -= 2;
            System.out.println();
        }
        */

        //maggie's nicer solution

        int column = (size * 2) - 1;

        // top half with middle row
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < column; j++) {
                if (j <= (column / 2) + i && j >= (column / 2) - i) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
                System.out.println();
        }
        //bottom half after middle row
        for (int i = size-2; i >=0; i--) {
            for (int j = 0; j < column; j++) {
                if (j <= (column / 2) + i && j >= (column / 2) - i) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
