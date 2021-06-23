package day3.zoo.animals;

import day3.flyable.Flyable;

public class Bird extends Animal implements Flyable {

    private int speed;
    private boolean canFly;

    public Bird(String name) {
        this.name = name;
        this.livingEnvironment = "Air";
        this.canFly = true;
    }

    public Bird(String name, int speed, boolean canFly) {
        this.name = name;
        this.speed = speed;
        this.canFly = canFly;
    }

    public void cantFly() {
        this.canFly = false;
    }

    @Override
    public String breed() {
        return "laying eggs.";
    }

    @Override
    public void land() {
        System.out.println(this.name + " has landed safely in the nest.");
    }

    @Override
    public void fly() {
        System.out.println(this.name + " is enjoying the fresh air in the high altitudes.");
    }

    @Override
    public void takeOff() {
        System.out.println(this.name + " is taking off to bring back some food.");
    }
}
