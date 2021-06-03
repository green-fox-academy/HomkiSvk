package com.company;

public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        float hours = 6;
        int weeks = 17;
        float averageHours = 52;

        System.out.println("Hours spend coding in semester (only workdays): " + (weeks*5)*hours);

        System.out.println("Coding percentage in 52 hour work week is: " +  ((hours*5)/averageHours)*100 + " %");


    }
}

