package day3.flyable;

public class Helicopter extends Vehicle implements Flyable {

    private final int fuelConsumption;

    public Helicopter(String model, int fuelCapacity, int maxSpeed) {
        this.model = model;
        this.fuelCapacity = fuelCapacity;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = 50;
    }

    private int maxDistance() {
        return (this.fuelCapacity / this.fuelConsumption) * 100;
    }

    @Override
    public void land() {
        System.out.println(this.model + " has landed safely.");
    }

    @Override
    public void fly() {
        System.out.println(this.model + " can fly over distance of " + this.maxDistance() + " on full tank.");
    }

    @Override
    public void takeOff() {
        System.out.println(this.model + " is taking off with " + this.fuelCapacity + " in the tank.");
    }
}
