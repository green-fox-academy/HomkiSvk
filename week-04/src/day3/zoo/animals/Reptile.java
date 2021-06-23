package day3.zoo.animals;

public class Reptile extends Animal {

    private String size;

    public Reptile(String name) {
        this.name = name;
        this.livingEnvironment = "Watter and ground";
    }

    @Override
    public String breed() {
        return "laying eggs.";
    }
}
