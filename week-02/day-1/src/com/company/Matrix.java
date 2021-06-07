package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    // - Create a two dimensional array dynamically with the following content.
    //   Note that a two dimensional array is often called matrix if every
    //   internal array has the same length.
    //   Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    //   Its length should depend on a variable
    //
    // - Print this two dimensional array to the output

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How big of a matrix u want? ");
        int size = scan.nextInt();


        int [][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i==j){
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j]=0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
