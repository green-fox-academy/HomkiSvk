package com.company;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String a, String b) {
        if (a.length() == b.length()) {
            char[] wordA = a.toCharArray();
            char[] wordB = b.toCharArray();
            Arrays.sort(wordA);
            Arrays.sort(wordB);

            return Arrays.equals(wordA, wordB);
        }

        public static void main (String[]args){
            System.out.println("dog and god: " + isAnagram("dog", "god"));

            System.out.println("green and fox: " + isAnagram("green", "fox"));
        }
    }
