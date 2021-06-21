package day1.exercises.aircraftcarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

    private int ammoStorage;
    private int healthPoints;

    List<Aircraft> aircraftsOnTheShip = new ArrayList<>();

    public Carrier(int ammoStorage, int healthPoints) {
        this.ammoStorage = ammoStorage;
        this.healthPoints = healthPoints;
    }

    public void add(Aircraft aircraft) {
        aircraftsOnTheShip.add(aircraft);
    }

    public void fill() throws CarrierOutOfAmmo {
        if (ammoStorage <= 0) {
            throw new CarrierOutOfAmmo();
        } else {
            for (Aircraft aircraft : aircraftsOnTheShip) {
                if (aircraft.isPriority()) {
                    ammoStorage = aircraft.refillAmmo(ammoStorage);
                }
            }
            for (Aircraft air : aircraftsOnTheShip) {
                if (!air.isPriority()) {
                    ammoStorage = air.refillAmmo(ammoStorage);
                }
            }
        }
    }

    public void fight(Carrier otherOne) {
        for (Aircraft aircrafts : aircraftsOnTheShip) {
            otherOne.healthPoints -= aircrafts.fight();
        }
    }

    private int totalDmg() {
        int totalDmg = 0;
        for (Aircraft aircrafts : aircraftsOnTheShip) {
            totalDmg += (aircrafts.getCurrentAmmo() * aircrafts.getBaseDmg());
        }
        return totalDmg;
    }


    public void getStatus() {
        if (this.healthPoints <= 0) {
            System.out.println("It's dead Jim :(");
        } else {
            System.out.println("HP: " + healthPoints + ", Aircraft count: " + aircraftsOnTheShip.size() +
                    ", Ammo storage: " + ammoStorage + ", Total damage: " + totalDmg());
            for (Aircraft aircaft : aircraftsOnTheShip) {
                aircaft.getStatus();
            }
        }
        System.out.println();
    }

    public class CarrierOutOfAmmo extends Exception {
        public CarrierOutOfAmmo() {
            System.out.println("Carrier run out of ammunition.");
        }
    }
}
