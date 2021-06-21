package day1.exercises.garden;

public class Main {

    public static void main(String[] args) {

        Garden garden = new Garden();

        garden.addPlant(new Tree("purple"));
        garden.addPlant(new Tree("orange"));
        garden.addPlant(new Flower("blue"));
        garden.addPlant(new Flower("yellow"));

        garden.info();

        garden.watteringPlants(40);
        garden.info();

        garden.watteringPlants(70);
        garden.info();
    }
}
