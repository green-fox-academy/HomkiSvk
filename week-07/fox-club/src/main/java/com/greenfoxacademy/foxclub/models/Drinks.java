package com.greenfoxacademy.foxclub.models;

public enum Drinks {
    VODKA("Vodka"),
    YOHOO("Yoohoo"),
    JUICE("Juice"),
    MILK("Milk"),
    BEER("Beer"),
    BLOOD("Blood");

    private final String displayValue;

    Drinks(String displayValue){
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
