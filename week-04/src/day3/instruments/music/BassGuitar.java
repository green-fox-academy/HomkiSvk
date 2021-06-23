package day3.instruments.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar() {
        this.name = "Bass Guitar";
        this.numberOfStrings = 4;
        this.sound = "Duum-duum-duum";
    }

    public BassGuitar(int strings) {
        this.name = "Bass Guitar";
        this.numberOfStrings = strings;
        this.sound = "Duum-duum-duum";
    }

}
