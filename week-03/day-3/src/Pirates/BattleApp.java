package Pirates;

public class BattleApp {

    public static void main(String[] args) {

        Ship blackPearl = new Ship("Black Pearl");
        Ship theHMSInterceptor = new Ship("The HMS Interceptor");
        Ship theFairWind = new Ship("The Fair Wind");

        blackPearl.fillShip();
        theFairWind.fillShip();
        theHMSInterceptor.fillShip();

        blackPearl.shipInfo();
        theFairWind.shipInfo();
        blackPearl.battle(theFairWind);
        theHMSInterceptor.battle(blackPearl);
    }
}
