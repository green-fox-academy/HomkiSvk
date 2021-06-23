package day3.zoo.animals;

public class Bird extends Animal {

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

    public void cantFly(){
        this.canFly = false;
    }

    @Override
    public String breed() {
        return "laying eggs.";
    }
}
