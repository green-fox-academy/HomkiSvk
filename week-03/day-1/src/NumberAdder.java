public class NumberAdder {
    // Write a recursive function that takes one parameter: n and
    // adds numbers from 1 to n.

    public static void main(String[] args) {

        System.out.println(numAdd(-7));
    }

    private static int numAdd(int i) {
        if (i==0)
            return 0;
        if (i < 0)
            return i + numAdd(i+1);
        if (i == 1)
            return 1;
        return i + numAdd(i-1);
    }
}
