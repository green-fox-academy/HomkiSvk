package day2.charsequence;

public class Gnirts implements CharSequence {

    private final String string;

    public Gnirts(String string) {
        this.string = string;
    }

    @Override
    public int length() {
        char[] toLength = this.string.toCharArray();
        return toLength.length;
    }

    @Override
    public char charAt(int index) {
        String result = this.string;
        return result.charAt(result.length() - 1 - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.string.subSequence(start, end);
    }
}
