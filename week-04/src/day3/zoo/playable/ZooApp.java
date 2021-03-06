package day3.zoo.playable;

import day3.zoo.animals.*;

public class ZooApp {

    public static void main(String[] args) {

        Reptile reptile = new Reptile("Crocodile");
        Mammal mammal = new Mammal("Koala");
        Bird bird = new Bird("Parrot");

        System.out.println("How do you breed?");
        System.out.println("A " + reptile.getName() + ", " + reptile.whereDoesItLive() +
                " based animal is breeding by " + reptile.breed());
        System.out.println("A " + mammal.getName() + ", " + mammal.whereDoesItLive() +
                " based animal is breeding by " + mammal.breed());
        System.out.println("A " + bird.getName() + ", " + bird.whereDoesItLive() +
                " based animal is breeding by " + bird.breed());
    }

}
