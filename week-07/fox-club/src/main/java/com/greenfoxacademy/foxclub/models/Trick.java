package com.greenfoxacademy.foxclub.models;

public enum Trick {
    WRITE_HTML("Write HTML", "html.jpg"),
    JAVA("Java", "java.jpg");


    private final String displayValue;
    private final String description;

    Trick(String displayValue, String description) {
        this.displayValue = displayValue;
        this.description = description;
    }

    public String getDisplayValue() {
        return displayValue;
    }

    public String getDescription() {
        return description;
    }

}