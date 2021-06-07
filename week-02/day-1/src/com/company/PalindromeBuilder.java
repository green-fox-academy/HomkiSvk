package com.company;

import java.util.Scanner;

public class PalindromeBuilder {
    public static String createPalindrome (String a){
        StringBuilder palindrome = new StringBuilder(a);
        for (int i = a.length()-1; i >= 0; i--) {
            char[] word = a.toCharArray();
            palindrome.append(word[i]);
        }
        return palindrome.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Put a word of which u want to see a palindrome of:");
        String input = scan.next();
        System.out.println(createPalindrome(input));
    }
}
