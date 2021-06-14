public class GreatestCommonDivisor {
    // Find the greatest common divisor of two numbers using recursion.

    public static void main(String[] args) {

        System.out.println(greatDivisor(100, 45));

    }
    //euclidean algorithm
    private static int greatDivisor(int a, int b) {
        if (b==0)
            return a;
        else return greatDivisor(b, a % b);

    }
}
