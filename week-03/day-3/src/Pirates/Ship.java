package Pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

    private String name;
    private List<Pirate> crew = new ArrayList<>();
    private Pirate captain;
    private Random rnd = new Random();

    Ship(String name) {
        this.name = name;
    }

    public Ship fillShip() {
        this.captain = new Pirate();
        int randomPirates = 20 + rnd.nextInt(94);
        for (int i = 0; i < randomPirates; i++) {
            crew.add(new Pirate());
        }
        System.out.println("This ship has a captain and " + crew.size() + " pirates.");
        return this;
    }

    public void shipInfo() {
        System.out.println("""
                            \n
                            |~
                           |/    w
                          / (   (|   \\
                         /( (/   |)  |\\
                  ____  ( (/    (|   | )  ,
                 |----\\ (/ |    /|   |'\\ /^;
                \\---*---Y--+-----+---+--/(
                 \\------*---*--*---*--/
                  '~~ ~~~~~~~~~~~~~~~\n""");
        System.out.println("\nCaptain at " + this.name + this.captain.toString() + " And drank " + this.captain.getIntoxication() + " rums.\n" +
                "There is " + this.howManyAlive() + " pirates in the crew alive.");
    }

    private void crewBattle(Ship otherShip) {
        List<Integer> thisIndexesList = new ArrayList<>();
        List<Integer> otherShipIndexesList = new ArrayList<>();

        for (int i = 0; i < Math.min(this.crew.size(), otherShip.crew.size()); i++) {
            this.crew.get(i).brawl(otherShip.crew.get(i));
            if (!this.crew.get(i).isAlive()) {
                thisIndexesList.add(i);
            } else if (!otherShip.crew.get(i).isAlive()) {
                otherShipIndexesList.add(i);
            }
        }
        for (int i = 0; i < thisIndexesList.size(); i++) {
            this.crew.remove(thisIndexesList.get(i) - i);

        }
        for (int i = 0; i < otherShipIndexesList.size(); i++) {
            otherShip.crew.remove(otherShipIndexesList.get(i) - i);

        }
    }

    public void battle(Ship otherShip) {
        this.crewBattle(otherShip);

        if (this.captain.getIntoxication() + this.howManyAlive() > otherShip.captain.getIntoxication() + otherShip.howManyAlive()) {
            this.party();
            otherShip.loserCrew();
            System.out.println("Winner: \n");
            this.shipInfo();
            System.out.println("Looser: \n");
            otherShip.shipInfo();
        } else {
            this.loserCrew();
            otherShip.party();
            System.out.println("Winner: \n");
            otherShip.shipInfo();
            System.out.println("Looser: \n");
            this.shipInfo();
        }
    }

    public int howManyAlive() {
        return this.crew.size();
    }

    private void loserCrew() {
        if (this.crew.size() == 0)
            return;
        if (this.crew.size() == 1) {
            this.crew.get(0).die();
            this.crew.remove(0);
        } else {
            int deaths = rnd.nextInt(this.crew.size());
            for (int i = 0; i < deaths; i++) {
                this.crew.get(0).die();
                this.crew.remove(0);
            }
        }
    }

    private void party() {
        for (Pirate pirate : this.crew) {
            int drink = rnd.nextInt(5);
            for (int j = 0; j < drink; j++) {
                pirate.drinkSomeRum();
                this.captain.drinkSomeRum();
            }
        }
    }
}
