package day2.charsequence;

public class ShiftedCharSequence implements CharSequence {

    private String string;

    public ShiftedCharSequence(String example, int i) {
        String result = example.substring(0, i);
        this.string = example.substring(i) + result;
    }

    public String getString() {
        return string;
    }

    @Override
    public int length() {
        char[] toLength = this.string.toCharArray();
        return toLength.length;
    }

    @Override
    public char charAt(int index) {
        char[] at = string.toCharArray();
        return at[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        String result = this.string.substring(0, start);
        return ((this.string.substring(start)) + result);
    }

    @Override
    public String toString() {
        return string;
    }
}
