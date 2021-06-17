package PetrolStation;

public class Main {

    public static void main(String[] args) {

        Station chevronAtSunsetBeach = new Station(2400);
        Car dodgeCharger = new Car();

        System.out.println("Remaining gas in gas station: " + chevronAtSunsetBeach.getGasAmount());
        System.out.println("Remaining gas in the car: " + dodgeCharger.getGasAmountInCar() + "\n");

        chevronAtSunsetBeach.refill(dodgeCharger);

        System.out.println("Remaining gas in gas station: " + chevronAtSunsetBeach.getGasAmount());
        System.out.println("Remaining gas in the car: " + dodgeCharger.getGasAmountInCar());

    }

}
