package Enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Car {

    private CarTypes type;
    private CarColors color;

    Car(CarColors color, CarTypes type) {
        this.color = color;
        this.type = type;
    }

    public CarColors getColor() {
        return color;
    }

    public CarTypes getType() {
        return type;
    }

    @Override
    public String toString() {
        return this.getColor() + " " + this.getType();
    }

    public static void main(String[] args) {
        Random rand = new Random();

        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < 256; i++) {
            int color = rand.nextInt(CarColors.values().length);
            int type = rand.nextInt(CarTypes.values().length);

            carList.add(i, new Car(CarColors.values()[color], CarTypes.values()[type]));
        }

        HashMap<CarColors, Integer> colorTable = new HashMap<>();
        for (Car car : carList) {
            if (!colorTable.containsKey(car.getColor())) {
                colorTable.put(car.getColor(), 1);
            } else {
                int value = colorTable.get(car.getColor());
                colorTable.put(car.getColor(), value + 1);
            }
        }

        for (CarColors colors : colorTable.keySet()) {
            System.out.println(colors + " " + colorTable.get(colors).toString());
        }
        System.out.println();

        HashMap<CarTypes, Integer> typeTable = new HashMap<>();
        for (Car car : carList) {
            if (!typeTable.containsKey(car.getType())) {
                typeTable.put(car.getType(), 1);
            } else {
                int value = typeTable.get(car.getType());
                typeTable.put(car.getType(), value + 1);
            }
        }

        for (CarTypes types : typeTable.keySet()) {
            System.out.println(types + " " + typeTable.get(types).toString());
        }
        System.out.println();

        HashMap<String, Integer> vehicleTable = new HashMap<>();
        for (Car car : carList) {
            if (!vehicleTable.containsKey(car.toString())) {
                vehicleTable.put(car.toString(), 1);
            } else {
                int value = vehicleTable.get(car.toString());
                vehicleTable.put(car.toString(), value + 1);
            }
        }
        int maxValue = 0;
        String maxKey = "";

        for (String cars : vehicleTable.keySet()) {
            int value = vehicleTable.get(cars);
            if (value > maxValue) {
                maxValue = value;
                maxKey = cars;
            }
        }
        System.out.println("Vehicle with most apperance is: " + maxKey + " " + maxValue);
        System.out.println();


    }

}


