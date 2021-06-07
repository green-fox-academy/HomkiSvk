package com.company;

import java.util.Scanner;

public class FactorialFunc {
    //  Create the usual class wrapper and main method on your own

    // - Create a function called `calculateFactorial()`
    //   that returns the factorial of its input

    // saw once on some youtube tutorial - Recursion
    public static int calculateFactorialWithRecursion (int n){
        if (n==1) {
            return 1;
        }else{
            return n*calculateFactorialWithRecursion(n-1);
        }
    }

    public static int calculateFactorial (int n){
        int factSum=1;
        for (int i = 1; i <= n; i++) {
            factSum *= i;
        }
        return factSum;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Give me number of which u want to see a factiorial of: ");
        int input = scan.nextInt();

        System.out.println("Recursion factorial function: " +calculateFactorialWithRecursion(input));

        System.out.println("For loop calc: " +calculateFactorial(input));
    }
}
