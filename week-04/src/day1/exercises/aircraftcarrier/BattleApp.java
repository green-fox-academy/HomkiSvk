package day1.exercises.aircraftcarrier;

public class BattleApp {

    public static void main(String[] args) {

        Carrier carrier1 = new Carrier(2300, 5000);
        Carrier carrier2 = new Carrier(1800, 4400);

        carrier1.add(new F35());
        carrier1.add(new F35());
        carrier1.add(new F35());
        carrier1.add(new F35());
        carrier1.add(new F16());
        carrier1.add(new F16());

        carrier2.add(new F35());
        carrier2.add(new F16());

        try {
            carrier1.fill();
        } catch (Carrier.CarrierOutOfAmmo carrierOutOfAmmo) {
            carrierOutOfAmmo.printStackTrace();
        }

        carrier1.getStatus();
        carrier2.getStatus();
        carrier1.fight(carrier2);
        carrier1.getStatus();
        carrier2.getStatus();
        try {
            carrier1.fill();
        } catch (Carrier.CarrierOutOfAmmo carrierOutOfAmmo) {
            carrierOutOfAmmo.printStackTrace();
        }

        carrier1.getStatus();
        carrier2.getStatus();
        carrier1.fight(carrier2);
        carrier1.getStatus();
        carrier2.getStatus();


    }
}
