package day1.exercises.garden;

public class Tree extends Plant {

    protected final double absorptionTree = 0.4;
    protected final double needsWater = 10;
    private double waterAmount;

    public Tree(String color) {
        super(color);
        this.waterAmount = 0;
    }

    public void info() {
        if (needsWater > waterAmount)
            System.out.println("The " + color + " Tree needs water");
        else
            System.out.println("The " + color + " Tree doesn't need water");
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
