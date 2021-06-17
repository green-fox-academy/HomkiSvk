package Sharpies;

public class Main {

    public static void main(String[] args) {

        Sharpie sharp1 = new Sharpie("black", 1.2f);
        Sharpie sharp2 = new Sharpie("black", 1.2f);
        Sharpie sharp3 = new Sharpie("black", 1.2f);
        Sharpie sharp4 = new Sharpie("black", 1.2f);
        Sharpie sharp5 = new Sharpie("black", 1.2f);

        SharpieSet sharpieSet = new SharpieSet();

        sharpieSet.add(sharp1);
        sharpieSet.add(sharp2);
        sharpieSet.add(sharp3);
        sharpieSet.add(sharp4);
        sharpieSet.add(sharp5);

        sharpieSet.countUsable();

        for (int i = 0; i < 10; i++) {
            sharp1.use();
            sharp3.use();
        }

        System.out.println(sharpieSet.getSharpieSet());
        sharpieSet.countUsable();
        System.out.println(sharpieSet.getSharpieSet());
        sharpieSet.removeTrash();
        sharpieSet.countUsable();
        System.out.println(sharpieSet.getSharpieSet());


    }
}
