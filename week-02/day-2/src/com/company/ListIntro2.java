package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class ListIntro2 {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");
        ArrayList<String> listB = new ArrayList<>(listA);
        System.out.println(listA.contains("Durian"));
        listB.remove("Durian");
        listA.add(4, "Kiwifruit");
        System.out.println(listA.equals(listB));
        System.out.println(listA.indexOf("Avocado"));
        System.out.println(listB.indexOf("Durian"));
        listB.addAll(Arrays.asList("Fruit", "Pomelo"));
        System.out.println(listA.get(2));
    }
}
