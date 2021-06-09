package com.company;

import java.util.Scanner;

public class DivideByZero {
    // Create a function that divides number 10
    // by a number that's passed as a paramater and prints the result.
    // It should print "fail" if the parameter is 0

    private static void divide (int a){
        try {
            int result = 10 / a;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a divisor: ");
        int divisor = scanner.nextInt();

        divide(divisor);
    }
}
