package com.greenfoxacademy.foxclub.models;

public enum Foods {
    FISH("Fish"),
    KITKAT("KitKat"),
    PIZZA("Pizza"),
    HAMBURGER("Hamburger"),
    TACOS("Tacos"),
    GUMMYBEARS("GummyBears");

    private final String displayValue;

    Foods (String displayValue){
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }

}
