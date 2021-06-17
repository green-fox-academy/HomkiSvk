package Farm;

public class Main {

    public static void main(String[] args) {

        Farm myFarm = new Farm();

        for (int i = 0; i < 11; i++) {
            myFarm.breed();
        }
        myFarm.sell();

        myFarm.breed();
        myFarm.breed();

    }
}
