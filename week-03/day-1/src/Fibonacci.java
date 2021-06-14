public class Fibonacci {
    // The fibonacci sequence is a famous bit of mathematics,
    // and it happens to have a recursive definition.
    // The first two values in the sequence are 0 and 1 (essentially 2 base cases).
    // Each subsequent value is the sum of the previous two values,
    // so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
    // Define a recursive fibonacci(n) method that
    // returns the nth fibonacci number,
    // with n=0 representing the start of the sequence.

    public static void main(String[] args) {

        System.out.println(fibo(9));

    }

    private static int fibo ( int n ) {
        if (n == 0 )
            return 0;

        if (n == 1)
            return 1 + fibo(0);

        else
        return fibo(n-1) + fibo(n-2);
    }

}
