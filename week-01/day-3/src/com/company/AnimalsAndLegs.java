package com.company;

import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner scanner = new Scanner(System.in);
        int chickens;
        int pigs;

        System.out.println("How many chickens do you have? ");
        chickens = scanner.nextInt();

        System.out.println("How many pigs do you have?");
        pigs = scanner.nextInt();

        System.out.println("Your "+chickens+" chickens and "+pigs+" pigs have together "
                + ((chickens*2)+(pigs*4))+ " legs");

    }
}

