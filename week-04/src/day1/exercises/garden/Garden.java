package day1.exercises.garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    private List<Plant> plants = new ArrayList<>();

    public void info() {
        System.out.println("""
                                
                      wWWWw               wWWWw
                vVVVv (___) wWWWw         (___)  vVVVv
                (___)  ~Y~  (___)  vVVVv   ~Y~   (___)
                 ~Y~   \\|    ~Y~   (___)    |/    ~Y~
                 \\|   \\ |/   \\| /  \\~Y~/   \\|    \\ |/
                \\\\|// \\\\|// \\\\|/// \\\\|//  \\\\|// \\\\\\|///
                ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
                """);
        for (Plant plant : plants) {
            plant.info();
        }
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public int thirsty(List<Plant> plants) {
        int finalAmount = 0;
        for (Plant plant : plants) {
            if (plant.isThirsty())
                finalAmount++;
        }
        return finalAmount;
    }

    public void watteringPlants(int amount) {
        double amountForEach = amount / thirsty(plants);

        for (Plant plant : plants) {
            plant.useWatter((int) amountForEach);
        }
    }


}
