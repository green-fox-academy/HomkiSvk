package com.company;

import java.util.Arrays;

public class Bubble {

    private static String bubble(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            int lowIndex=i;
            int temp;
            for (int j = i; j < ints.length; j++) {
                if (ints[lowIndex]>ints[j]){
                    lowIndex = j;
                }
            }
            temp = ints[lowIndex];
            ints[lowIndex] = ints[i];
            ints[i]= temp;
        }
        return Arrays.toString(ints);
    }

    private static String advancedBubble(int[] ints, boolean b) {
        if (!b) {
            bubble(ints);
        } else {
            for (int i = 0; i < ints.length; i++) {
                int highIndex=i;
                int temp;
                for (int j = i; j < ints.length; j++) {
                    if (ints[highIndex]<ints[j]){
                        highIndex = j;
                    }
                }
                temp = ints[highIndex];
                ints[highIndex] = ints[i];
                ints[i]= temp;
            }
        }
        return Arrays.toString(ints);
    }

    public static void main(String[] args) {
        //  Create a function that takes an array of numbers as parameter
        //  and returns an array where the elements are sorted in ascending numerical order
        //  When you are done, add a second boolean parameter to the function
        //  If it is `true` sort the array descending, otherwise ascending

        //  Example:
        System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
        //  should print [5, 9, 12, 24, 34]
        System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
        //  should print [34, 24, 12, 9, 5]
        System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, false));
    }


}