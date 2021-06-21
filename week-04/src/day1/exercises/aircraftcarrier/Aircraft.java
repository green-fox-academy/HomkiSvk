package day1.exercises.aircraftcarrier;

public class Aircraft {

    private final int maxAmmo;
    private final int baseDmg;
    protected int currentAmmo;

    public Aircraft(int maxAmmo, int baseDmg) {
        this.maxAmmo = maxAmmo;
        this.baseDmg = baseDmg;
        this.currentAmmo = 0;
    }

    public int fight() {
        int dmg = this.currentAmmo * baseDmg;
        currentAmmo = 0;
        return dmg;
    }

    public int getBaseDmg() {
        return baseDmg;
    }

    public int getCurrentAmmo() {
        return currentAmmo;
    }

    public int refillAmmo(int amount) {
        if (amount > this.maxAmmo) {
            this.currentAmmo = this.maxAmmo;
            return amount - this.maxAmmo;
        } else {
            this.currentAmmo = amount;
            return 0;
        }
    }

    public String getType() {
        return this.toString();
    }

    public void getStatus() {
        System.out.println(this.getType() + ", Ammo: " + currentAmmo + ", Base Damage: " + baseDmg
                + ", All damage: " + currentAmmo * baseDmg);
    }

    public boolean isPriority() {
        return this instanceof F35;
    }

}
