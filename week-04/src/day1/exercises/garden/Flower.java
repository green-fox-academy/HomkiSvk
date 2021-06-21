package day1.exercises.garden;

public class Flower extends Plant {

    protected final double absorptionTree = 0.75;
    protected final double needsWater = 5;
    private double waterAmount;

    public Flower(String color) {
        super(color);
        this.waterAmount = 0;
    }

    public void info() {
        if (needsWater > waterAmount)
            System.out.println("The " + color + " Flower needs water");
        else
            System.out.println("The " + color + " Flower doesn't need water");
    }

    @Override
    public boolean isThirsty() {
        return needsWater > waterAmount;
    }

    @Override
    public void useWatter(int amount) {
        if (this.isThirsty()) {
            waterAmount += amount * absorptionTree;
        }
    }

}
