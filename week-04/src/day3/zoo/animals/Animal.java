package day3.zoo.animals;

public abstract class Animal {

    protected String name;
    protected int age;
    protected String gender;
    protected String livingEnvironment;

    public String getName() {
        return name;
    }

    public String whereDoesItLive(){
        return this.livingEnvironment;
    }

    public abstract String breed();
}
