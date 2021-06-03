package com.company;

public class Swap {
    public static void main(String[] args) {
        // Swap the values of the variables
        int a = 123;
        int b = 526;

        System.out.println("Before swap:");
        System.out.println("a: " +a);
        System.out.println("b: " +b);
        // swap
        int t;
        t = a;
        a = b;
        b = t;

        System.out.println("After swap:");
        System.out.println("a: " +a);
        System.out.println("b: " +b);
    }
}

