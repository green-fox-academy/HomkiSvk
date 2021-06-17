package Sharpies;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    List<Sharpie> sharpieSet = new ArrayList<>();

    public void add(Sharpie sharpie) {
        this.sharpieSet.add(sharpie);
    }

    public List<Sharpie> getSharpieSet() {
        return sharpieSet;
    }

    public void countUsable() {
        int count = 0;

        for (Sharpie next : sharpieSet) {
            if (next.getInkAmount() > 0) {
                count++;
            }
        }
        System.out.println("Usable sharpies in this set is: " + count);
    }

    public void removeTrash() {
        for (int i = 0; i < sharpieSet.size(); i++) {
            if (sharpieSet.get(i).getInkAmount() == 0) {
                sharpieSet.remove(i);
            }
        }
    }


}
