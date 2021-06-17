package Pirates;

public class WarApp {

    public static void main(String[] args) {

        Armada piratesOfCaribbean = new Armada();
        Armada frenchPirates = new Armada();

        for (int i = 0; i < 3; i++) {
            piratesOfCaribbean.armada.add(new Ship("Black Pearl " + i + "").fillShip());
        }

        for (int i = 0; i < 3; i++) {
            frenchPirates.armada.add(new Ship("Pink Pearl " + i + "").fillShip());
        }

        piratesOfCaribbean.war(frenchPirates);
    }
}
