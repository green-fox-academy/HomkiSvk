package com.company;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in distance in Miles: ");
        double miles = scanner.nextDouble();

        System.out.println("This distance in kilometers is: " + miles*1.609344);
    }
}

