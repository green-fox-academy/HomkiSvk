package com.company;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number and the user has to figure it out
        // The user can input guesses
        // After each guess the program would tell one of the following:
        //
        // The stored number is higher
        // The stored number is lower
        // You found the number: 8

        Random random = new Random();
        int guessedNum = random.nextInt(1000);
        System.out.println("Hi, lets play a guessing game. I generated a random whole number between 0 and 999. \nU have 20 guesses.Type your guess and ill tell you if its higher or lower.");

        Scanner scan = new Scanner(System.in);
        int inputNum;
        int count = 0;
        System.out.println("Let's try your first guess: ");
        inputNum = scan.nextInt();

        if(guessedNum==inputNum){
            System.out.println("Wow, u guessed it on first try. The number was: "+guessedNum);
        } else {
            while (guessedNum!=inputNum && count<=20){
                if (guessedNum>inputNum){
                    System.out.println("The stored number is higher. Try again: ");
                    inputNum = scan.nextInt();
                } else if (guessedNum<inputNum){
                    System.out.println("The stored number is lower. Try again: ");
                    inputNum = scan.nextInt();
                }count++;
            }
            if (guessedNum==inputNum){
                System.out.println("You found the number: "+guessedNum);
            } else {
                System.out.println("Sorry u used all of your guesses. Better luck next time!");
            }
        }


    }
}
