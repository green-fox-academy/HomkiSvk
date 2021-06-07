package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Reverse {
    // - Create an array variable named `numbers`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Reverse the order of the elements of `numbers`
    // - Print the elements of the reversed `numbers`

    public static void main(String[] args) {

        // with objects
        /*Integer numbers [] = {3, 4, 5, 6, 7};
        System.out.println("Before reverse: " +Arrays.toString(numbers));
        Collections.reverse(Arrays.asList(numbers));
        System.out.println("After reverse: " +Arrays.toString(numbers));*/

        // with for loop and primitive types
        int [] numbers = {3, 4, 5, 6, 7};
        System.out.println("Before reverse: " +Arrays.toString(numbers));
        for (int i = 0, t; i < numbers.length/2; i++) {
            t = numbers[i];
            numbers[i] = numbers[numbers.length-1 -i];
            numbers[numbers.length-1 -i] = t;
        }
        System.out.println("After reverse: " +Arrays.toString(numbers));


    }
}
