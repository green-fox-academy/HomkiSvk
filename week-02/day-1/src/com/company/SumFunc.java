package com.company;

import java.util.Scanner;

public class SumFunc {
    // Create the usual class wrapper and main method on your own

    // Write a function called `sum()` that returns the sum of numbers from zero to the given parameter

    public static int sum (int a){
        int all =0;
        for (int i = 0; i <= a; i++) {
            all +=i;
        }
        return all;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a number and ill print sum from 0 to that number: ");
        int input = scan.nextInt();
        System.out.println(sum(input));
    }


}
