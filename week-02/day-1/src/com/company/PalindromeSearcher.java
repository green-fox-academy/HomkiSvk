package com.company;

import java.util.ArrayList;

public class PalindromeSearcher {

    public static ArrayList<String> searchPalindrome (String a){
        char[]control = a.toCharArray();
        ArrayList<String> results = new ArrayList<>();
        for (int wordLength = 3; wordLength < control.length+3; wordLength++) {
            for (int i = 0; i <= control.length-wordLength; i++) {
                StringBuilder controlWord = new StringBuilder();
                //creating 1st word with 3 chars
                for (int j = i; j < wordLength+i; j++) {
                    controlWord.append(control[j]);
                }
                //creating palindrome to that word
                StringBuilder palindrome = new StringBuilder();
                for (int j = i+(wordLength-1); j >= i; j--) {
                    palindrome.append(control[j]);
                }if (controlWord.toString().equalsIgnoreCase(palindrome.toString())){
                    results.add(controlWord.toString());
                }
            }
        }
        return results;
    }

    public static void main(String[] args) {
        System.out.println(searchPalindrome("dog goat dad duck doodle never"));
        System.out.println(searchPalindrome("apple"));
        System.out.println(searchPalindrome("racecar"));
    }
}
