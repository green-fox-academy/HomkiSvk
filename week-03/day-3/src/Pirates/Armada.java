package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Armada {

    List<Ship> armada = new ArrayList<>();

    public void war(Armada opponentArmada) {
        int thisArmadaIndex = 0;
        int opponentArmadaIndex = 0;

        for (int i = 0; i < (this.armada.size() + opponentArmada.armada.size()); i++) {
            if (thisArmadaIndex == this.armada.size()) {
                System.out.println("The opponent armada won the battle.");
            } else if (opponentArmadaIndex == opponentArmada.armada.size()) {
                System.out.println("This armada won the battle.");
            } else {
                while (this.armada.get(thisArmadaIndex).howManyAlive() != 0 && opponentArmada.armada.get(opponentArmadaIndex).howManyAlive() != 0) {
                    this.armada.get(thisArmadaIndex).battle(opponentArmada.armada.get(opponentArmadaIndex));
                }
                if (this.armada.get(thisArmadaIndex).howManyAlive() == 0) {
                    thisArmadaIndex++;
                } else if (opponentArmada.armada.get(opponentArmadaIndex).howManyAlive() == 0) {
                    opponentArmadaIndex++;
                }
            }
        }
    }
}
