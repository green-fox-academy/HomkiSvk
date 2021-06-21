package day1.exercises.garden;

public class Tree extends Plant {

    public Tree(String color) {
        super(0.4, 10, color);
    }

    @Override
    public String toString() {
        return "Tree";
    }
}
