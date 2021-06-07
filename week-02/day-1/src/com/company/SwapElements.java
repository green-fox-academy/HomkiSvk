package com.company;

import java.util.Arrays;

public class SwapElements {
    // - Create an array variable named `orders`
    //   with the following content: `["first", "second", "third"]`
    // - Swap the first and the third element of `orders`

    public static void main(String[] args) {
        String [] orders = new String[] {"first", "second", "third"};

        System.out.println(Arrays.deepToString(orders));

        for (int i = 0; i < orders.length/2; i++) {
            String temp = orders[i];
            orders[i] = orders[orders.length-1 -i];
            orders[orders.length-1 -i] = temp;
        }
        System.out.println(Arrays.deepToString(orders));
    }
}
