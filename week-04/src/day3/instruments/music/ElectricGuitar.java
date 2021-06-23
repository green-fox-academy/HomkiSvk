package day3.instruments.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        this.name = "Electric Guitar";
        this.numberOfStrings = 6;
        this.sound = "Twang";
    }

    public ElectricGuitar(int strings) {
        this.name = "Electric Guitar";
        this.numberOfStrings = strings;
        this.sound = "Twang";
    }


}
