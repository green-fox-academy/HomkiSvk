package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonalFinance {
    public static void main(String[] args) {
        ArrayList<Integer> finance = new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120));

        int sum=0;
        for (Integer i: finance ) {
            sum +=i;
        }
        System.out.println("How much did we spent: " + sum );

        int greatest = finance.get(0);
        for (Integer integer : finance) {
            if (greatest < integer) {
                greatest = integer;
            }
        }
        System.out.println("Our greatest expense: " + greatest);

        int low = finance.get(0);
        for (Integer integer : finance) {
            if (low > integer) {
                low = integer;
            }
        }
        System.out.println("Our cheapest expense: " + low );

        System.out.println("Our average spending: " + sum/ finance.size() );
    }
}
