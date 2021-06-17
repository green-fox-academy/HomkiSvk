package Sharpies;

public class Sharpie {

    private String color;
    private float width;
    private float inkAmount;

    public Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100;
    }

    public float getInkAmount() {
        return inkAmount;
    }

    public void use() {
        this.inkAmount -= 10;
    }
}
