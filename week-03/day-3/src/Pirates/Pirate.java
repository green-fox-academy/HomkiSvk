package Pirates;

import java.util.Random;

public class Pirate {

    private int intoxication;
    private boolean isAlive;
    private Random rnd = new Random();

    Pirate() {
        this.intoxication = 0;
        this.isAlive = true;
    }

    public int getIntoxication() {
        return this.intoxication;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void drinkSomeRum() {
        if (!isAlive) {
            System.out.println("Hes dead.");
        } else
            this.howsItGoingMate();
    }

    public void howsItGoingMate() {
        if (!isAlive) {
            System.out.println("Hes dead.");
        } else {
            if (intoxication < 4) {
                //System.out.println("Pour me anudder!");
                this.intoxication++;
            } else {
                //System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
                this.passOut();
            }
        }
    }

    public void passOut() {
        if (!isAlive) {
            System.out.println("Hes dead.");
        } else {
            // System.out.println("Passed out");
            this.intoxication = 0;
        }
    }

    public void die() {
        this.isAlive = false;
        //System.out.println("He died");
    }

    public void brawl(Pirate opponent) {
        if (this.isAlive && opponent.isAlive) {
            int fight = rnd.nextInt(3);
            switch (fight) {
                case 0: {
                    this.die();
                    //System.out.println("This one died.");
                }
                break;
                case 1:
                    opponent.die();
                    //System.out.println("Opponent died.");
                    break;
                case 2:
                    this.passOut();
                    opponent.passOut();
                    //System.out.println("They both passed out.");
                    break;
                default:
            }
        }
    }

    @Override
    public String toString() {
        return (isAlive ? " is alive." : " is dead.");
    }
}
