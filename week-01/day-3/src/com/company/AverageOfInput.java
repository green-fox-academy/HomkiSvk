package com.company;

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        Scanner scan =new Scanner(System.in);

        System.out.println("Ill ask you to give me five numbers and at the end will be summary and average of them.");
        System.out.println("Give me first number: ");
        int num1 = scan.nextInt();
        System.out.println("Give me second number: ");
        int num2 = scan.nextInt();
        System.out.println("Give me third number: ");
        int num3 = scan.nextInt();
        System.out.println("Give me fourth number: ");
        int num4 = scan.nextInt();
        System.out.println("Give me fifth number: ");
        int num5 = scan.nextInt();
        int sum = num1+num2+num3+num4+num5;

        System.out.println("Sum: "+sum+", Average: "+(sum) / 5.);
    }
}

