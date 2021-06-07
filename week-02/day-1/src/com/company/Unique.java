package com.company;

import java.util.Arrays;

public class Unique {

    private static String findUniqueItems(int[] ints) {
        int count = 0;
        int[] ints2 = ints.clone();
        for (int i = 0; i < ints.length; i++) {
            for (int j = i+1; j < ints.length; j++) {
                if (ints[i] == ints2[j]) {
                    count++;
                    break;
                }
            }
        }
        int[] reduced = new int [(ints.length)-count];
        int cycles =0;
        for (int a:ints) {
            boolean isThere=false;
            for (int j : reduced) {
                if (a == j) {
                    isThere = true;
                    break;
                }
            }
            if (!isThere){
                reduced[cycles] = a;
                cycles++;
            }
        }
        return Arrays.toString(reduced);
    }

    public static void main(String[] args) {
        //  Create a function that takes an array of numbers as a parameter
        //  and returns an array of integers where every integer is unique (occurs only once)

        //  Example
        System.out.println(findUniqueItems(new int[] {1, 11, 34, 11, 52, 11, 61, 1, 34, 52, 52}));
        //  should print: `[1, 11, 34, 52, 61]`
    }


}