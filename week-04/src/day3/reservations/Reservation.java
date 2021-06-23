package day3.reservations;

import java.util.Random;

public class Reservation implements Reservationy {

    private final String code;
    private final String day;
    private final String pollOfChars = generatePool();

    public Reservation() {
        this.code = generateCode();
        this.day = Dow.values()[new Random().nextInt(Dow.values().length)].toString();
    }

    private String generatePool() {
        StringBuilder pool = new StringBuilder();
        for (int i = 48; i < 58; i++) {
            pool.append((char) i);
        }
        for (int i = 65; i < 91; i++) {
            pool.append((char) i);
        }
        return pool.toString();
    }

    private String generateCode() {
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            code.append(pollOfChars.charAt(new Random().nextInt(36)));
        }
        return code.toString();
    }

    @Override
    public String getDowBooking() {
        return this.day;
    }

    @Override
    public String getCodeBooking() {
        return this.code;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "code='" + code + '\'' +
                ", day='" + day + '\'' +
                ", pollOfChars='" + pollOfChars + '\'' +
                '}';
    }
}
