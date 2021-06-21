package day1.exercises.greenfoxinheritance;

import day1.inheritanceBeforeMR.Levels;

public class Mentor extends Person {

    private Levels level;

    public Mentor(String name, int age, String gender, Levels level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor() {
        this("Jane Doe", 30, "female", Levels.INTERMEDIATE);
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", " + age + " year old " + gender + " " + level + " mentor.");
    }

    public void getGoal() {
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }
}
