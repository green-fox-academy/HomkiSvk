package day3.zoo.animals;

public abstract class Animal {

    protected String name;
    protected int age;

    public String getName() {
        return name;
    }

    public abstract String breed();
}
