package com.company;

import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        Scanner scan = new Scanner(System.in);
        System.out.println("I will ask you to give me 2 different numbers to compare (max: + or - "+Integer.MAX_VALUE+ "):");

        System.out.println("Give me first number: ");
        int num1 = scan.nextInt();
        System.out.println("Give me second number: ");
        int num2 = scan.nextInt();

        if (num1>num2){
            System.out.println("The bigger one is: "+num1);
        } else if (num1==num2){
            System.out.println("Dont try me i asked you for different numbers, these are the same. Try again!");
        } else {
            System.out.println("The bigger one is: "+num2);
        }
    }
}

