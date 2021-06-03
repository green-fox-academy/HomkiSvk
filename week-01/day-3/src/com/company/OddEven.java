package com.company;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // then prints "Odd" if the number is odd, or "Even" if it is even

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a whole number and ill tell you if its odd or even (max: + or - "+Integer.MAX_VALUE+ "):");
        int num = scan.nextInt();

        if (num % 2 ==0 ){
            System.out.println("This number "+num+" is even.");
        }else {
            System.out.println("This number "+num+" is odd.");
        }
    }
}

