package day1.inheritanceBeforeMR;

import java.util.Locale;

public enum Levels {
    JUNIOR, INTERMEDIATE, SENIOR;

    @Override
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}
