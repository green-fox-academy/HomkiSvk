package PetrolStation;

public class Car {

    private double gasAmountInCar;
    private double capacity;

    Car() {
        this.gasAmountInCar = 0;
        this.capacity = 100;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getGasAmountInCar() {
        return gasAmountInCar;
    }

    public void setGasAmountInCar(double gasAmountInCar) {
        this.gasAmountInCar = gasAmountInCar;
    }
}
