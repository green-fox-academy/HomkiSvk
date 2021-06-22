package day2.comparable;

import java.util.Collections;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // - You have the `Fleet.Thing` class
        // - You have the `Fleet.Fleet` class
        // - You have the `Fleet.FleetOfThings` class with a `main()` method
        // - Download those, use those
        // - Create a fleet in the main() method

        Thing getMilk = new Thing("Get milk");
        Thing removeObstacle = new Thing("Remove the obstacle");
        Thing standUp = new Thing("Stand up");
        standUp.complete();
        Thing eatLunch = new Thing("Eat lunch");
        eatLunch.complete();

        fleet.add(getMilk);
        fleet.add(removeObstacle);
        fleet.add(standUp);
        fleet.add(eatLunch);

        // - Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        System.out.println(fleet);

        Collections.sort(fleet.getThings());

        System.out.println(fleet);
    }
}