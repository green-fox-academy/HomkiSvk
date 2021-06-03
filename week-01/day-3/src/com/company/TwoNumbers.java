package com.company;

public class TwoNumbers {
    public static void main(String[] args) {
        // Create a program that prints a few operations on two numbers: 22 and 13

        int a = 22;
        int b = 13;

        // Print the result of 13 added to 22
        System.out.println("13 added to 22: " + (a+b));

        // Print the result of 13 substracted from 22
        System.out.println("13 substracted from 22: " + (a-b));

        // Print the result of 22 multiplied by 13
        System.out.println("22 multiplied by 13: " + (a*b));

        // Print the result of 22 divided by 13 (as a decimal fraction)
        System.out.println("22 divided by 13 (as a decimal fraction): " + a +"/" + b );

        // Print the integer part of 22 divided by 13
        System.out.println("integer part of 22 divided by 13: " + a/b);

        // Print the remainder of 22 divided by 13
        System.out.println("remainder of 22 divided by 13: " + a % b);

    }
}
