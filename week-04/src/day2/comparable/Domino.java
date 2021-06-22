package day2.comparable;

public record Domino(int left, int right) implements Comparable<Domino> {

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }

    @Override
    public int compareTo(Domino o) {
        int result = this.left - o.left;
        if (result == 0) {
            return this.right - o.right;
        }
        return result;
    }
}
