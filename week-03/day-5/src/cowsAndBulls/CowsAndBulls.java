package cowsAndBulls;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class CowsAndBulls {

    static Scanner scan = new Scanner(System.in);
    private static Random rand = new Random();
    private static String target = "";
    private static int guessNum;
    private static int counter;
    boolean playing;


    public static void startTheGame() {
        for (int i = 0; i < 4; i++) {
            target += (rand.nextInt(10));
        }

        System.out.println("""
                I created a game of Cows and Bulls for you. In this game u have to guess a 4 digit number. 
                "For every number u guess correctly in the correct place u will receive a cow. 
                "For every number u guess correctly but in the wrong place u will receive a bull. 
                "If u guess both the number and place wrong u will receive nothing. 
                Now u have 30 tries to guess the number. Good luck!
                """);

        guess();
    }

    public static void guess() {
        String guessStr;

        System.out.println("Give me your guess: ");
        guessNum = scan.nextInt();

        //looping until i get the valid input from user
        while (!isValid(guessNum)) {
            System.out.println("Give me a valid input");
            guessNum = (scan.nextInt());
            if (isValid(guessNum))
                break;
        }

        guessStr = Integer.toString(guessNum);
        if (guessStr.equals(target)) {
            System.out.println("Congratulations!!! U guessed it right on your " + counter + " try.");
        } else {
            compareThem(guessStr, target);
        }
    }

    private static void compareThem(String guess, String target) {
        int cow = 0;
        int bull = 0;
        int length = guess.length();

        for (int iguess = 0; iguess < length; iguess++) {
            for (int itarget = 0; itarget < length; itarget++) {
                if (guess.charAt(iguess) == target.charAt(iguess)) {
                    cow++;
                    length--;
                    break;
                }

            }

        }
        guess();
    }

    private static boolean isValid(int validNum) {
        return (Integer.toString(validNum).toCharArray().length == 4);
    }


}
