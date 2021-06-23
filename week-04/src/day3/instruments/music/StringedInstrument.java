package day3.instruments.music;

public abstract class StringedInstrument extends Instrument {

    protected int numberOfStrings;
    protected String sound;

    public String sound() {
        return this.sound;
    }

    @Override
    public void play() {
        System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument that goes " + this.sound());
    }
}
