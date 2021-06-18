package fibonacci;

public class Fibonacci {

    public int fibo ( int n ) {
        if (n == 0 )
            return 0;

        if (n == 1)
            return 1 + fibo(0);

        else
            return fibo(n-1) + fibo(n-2);
    }
}
