package day3.zoo.animals;

public class Reptile extends Animal{

    public Reptile(String name) {
        this.name = name;
    }

    @Override
    public String breed() {
        return "laying eggs.";
    }
}
