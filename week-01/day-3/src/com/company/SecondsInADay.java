package com.company;

public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables above

        int secondsElapsed;
        secondsElapsed = currentSeconds + (currentHours*3600) + (currentMinutes*60);

        System.out.println("Remaining seconds today is: " + ((24*3600) - secondsElapsed));
    }
}
