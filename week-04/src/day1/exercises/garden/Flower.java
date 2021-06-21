package day1.exercises.garden;

public class Flower extends Plant {

    public Flower(String color) {
        super(0.75, 5, color);
    }

    @Override
    public String toString() {
        return "Flower";
    }
}
