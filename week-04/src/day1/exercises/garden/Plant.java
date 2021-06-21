package day1.exercises.garden;

public class Plant {

    private final double absorption;
    private final double needsWater;
    private double waterAmount;

    protected String color;

    public Plant(double absorption, double needsWater, String color) {
        this.absorption = absorption;
        this.needsWater = needsWater;
        this.color = color;
        this.waterAmount = 0;
    }

    public void info() {
        if (needsWater > waterAmount)
            System.out.println("The " + color + " " + this + " needs water");
        else
            System.out.println("The " + color + " " + this + " doesn't need water");
    }

    public void useWatter(int amount) {
        if (this.isThirsty()) {
            waterAmount += amount * absorption;
        }
    }

    public boolean isThirsty() {
        return needsWater > waterAmount;
    }
}
