package com.company;

import java.util.HashMap;

public class ShoppingList2 {

    private static double calculate (HashMap<String, Double> price, HashMap<String,Integer> amount ){
        double result=0;
        for (String check: amount.keySet()) {
            if (price.containsKey(check)){
                result += (price.get(check))*(amount.get(check));
            }
        }
        return result;
    }


    public static void main(String[] args) {
        HashMap<String, Double> priceList = new HashMap<>();
        priceList.put("Milk",1.07);
        priceList.put("Rice", 1.59);
        priceList.put("Eggs", 3.14);
        priceList.put("Cheese",	12.60);
        priceList.put("Chicken Breasts", 9.40);
        priceList.put("Apples",	2.31);
        priceList.put("Tomato",	2.58);
        priceList.put("Potato",	1.75);
        priceList.put("Onion", 1.10);

        HashMap<String, Integer> bobsList = new HashMap<>();
        bobsList.put("Milk", 3);
        bobsList.put("Rice", 2);
        bobsList.put("Eggs", 2);
        bobsList.put("Cheese",	1);
        bobsList.put("Chicken Breasts", 4);
        bobsList.put("Apples",	1);
        bobsList.put("Tomato",	2);
        bobsList.put("Potato",	1);

        HashMap<String, Integer> alicesList = new HashMap<>();
        alicesList.put("Rice", 1);
        alicesList.put("Eggs", 5);
        alicesList.put("Chicken Breasts", 2);
        alicesList.put("Apples",	1);
        alicesList.put("Tomato",	10);

        System.out.println("Bob will pay: " + calculate(priceList, bobsList));
        System.out.println("Alice will pay: " + calculate(priceList, alicesList));



    }
}
