public class SumDigit {
    // Given a non-negative integer n, return the sum of it's digits recursively
    // (without loops).
    //
    // Hint
    //
    // Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
    //
    // Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).

    public static void main(String[] args) {
        System.out.println(sumThemDigits(456));
    }

    private static int sumThemDigits(int i) {
        if (i/10==0)
            return i%10 ;

        return i%10 + (sumThemDigits(i/10));
    }
}
