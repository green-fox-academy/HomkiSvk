package Farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    private int farmAnimalLimits = 10;

    List<Animal> farmList = new ArrayList<>();

    public void breed() {
        if (farmList.size() < farmAnimalLimits) {
            farmList.add(new Animal());
            System.out.println("New animal was added.");
        } else {
            System.out.println("There is no room for new animal. Sell something first.");
        }

    }

    public void sell() {
        int leastHungry = farmList.get(0).getHunger();
        int position = 0;
        for (int i = 0; i < farmList.size(); i++) {
            if (farmList.get(i).getHunger() > leastHungry)
                leastHungry = farmList.get(i).getHunger();
            position = i;
        }
        System.out.println("One of yours animals was sold.");
        farmList.remove(position);
    }

}
