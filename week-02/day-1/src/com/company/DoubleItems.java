package com.company;

import java.util.Arrays;

public class DoubleItems {
    // - Create an array variable named `numberList`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Double all the values in the array

    public static void main(String[] args) {
        int[] numberList = {3, 4, 5, 6, 7};

        System.out.println("Before" + Arrays.toString(numberList));

        for (int i = 0; i < numberList.length; i++) {
            numberList[i] *=2;
        }
        System.out.println("Double" + Arrays.toString(numberList));
    }

}
