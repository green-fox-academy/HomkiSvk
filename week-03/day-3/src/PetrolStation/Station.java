package PetrolStation;

public class Station {

    private double gasAmount;

    Station(double gasAmount) {
        this.gasAmount = gasAmount;
    }

    public double getGasAmount() {
        return gasAmount;
    }

    public void refill(Car car) {
        this.gasAmount -= car.getCapacity() - car.getGasAmountInCar();
        car.setGasAmountInCar(car.getCapacity());
        System.out.println("Car has been refueled" + "\n");
    }


}
