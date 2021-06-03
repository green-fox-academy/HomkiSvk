package com.company;

import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        // Write a program that asks for two numbers
        // The first number represents the number of girls that comes to a party, the
        // second represents the number of boys
        //
        // If the the number of girls and boys are equal and 20 or more people are coming to the party
        // it should print: The party is excellent!
        //
        // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
        // it should print: Quite a cool party!
        //
        // If there are less people coming than 20
        // it should print: Average party...
        //
        // If no girls are coming, regardless the count of the people
        // it should print: Sausage party

        Scanner scan = new Scanner(System.in);
        System.out.println("I will ask how many girls and boys are coming to a party and tell you how the party will be:");

        System.out.println("How many girls are coming?");
        int girls = scan.nextInt();
        System.out.println("How many boys are coming?");
        int boys = scan.nextInt();

        if (girls<0 || boys <0){
            System.out.println("Give me only positive values. Try again!");
        } else {
            if (girls == 0) {
                System.out.println("Sausage party");
            } else if (boys + girls >= 20) {
                if (boys == girls) {
                    System.out.println("The party is excellent!");
                } else {
                    System.out.println("Quite a cool party!");
                }
            } else  {
                System.out.println("Average party...");
            }
        }



    }
}
