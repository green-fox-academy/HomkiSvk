package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number
        // It would ask this many times to enter an integer
        // If all the integers are entered it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4

        Scanner scan = new Scanner(System.in);

        System.out.println("Hi, i will print sum and average of integer values u give me.\nHow many values do u want to give?");
        int count = scan.nextInt();
        int sum=0;

        for (int i = 0; i < count; i++) {
            System.out.println("Give me a number: ");
            sum = sum+scan.nextInt();
        }
        DecimalFormat myFormatter = new DecimalFormat("##########.#");
        String output = myFormatter.format((double)sum/count);
        System.out.println("Sum: "+sum+", Average: " +output);

    }
}
