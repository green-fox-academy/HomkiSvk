package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapIntro2 {
    public static void main(String[] args) {
        Map<String, String> newMap = new HashMap<>();

        newMap.put("978-1-60309-452-8", "A Letter to Jo");
        newMap.put("978-1-60309-459-7", "Lupus");
        newMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        newMap.put("978-1-60309-461-0", "The Lab");

        for (String a: newMap.keySet()) {
            System.out.println(newMap.get(a) + " (ISBN: "+ a +")");
        }
        newMap.remove("978-1-60309-444-3");
        for (String a: newMap.keySet()) {
            if (newMap.get(a).equals("The Lab")){
                newMap.remove(a);
            }
        }
        System.out.println();
        for (String a: newMap.keySet()) {
            System.out.println(newMap.get(a) + " (ISBN: "+ a +")");
        }
        newMap.put("978-1-60309-450-4", "They Called Us Enemy");
        newMap.put("978-1-60309-453-5", "Why Did We Trust Him?");
        System.out.println(newMap.containsKey("478-0-61159-424-8"));
        System.out.println(newMap.get("978-1-60309-453-5"));






    }
}
