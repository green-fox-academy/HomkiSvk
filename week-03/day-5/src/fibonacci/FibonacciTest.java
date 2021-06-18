package fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    Fibonacci fibonacci;
    int index;
    int[] fiboNumbers = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811};

    @BeforeEach
    void setUp() {
        fibonacci = new Fibonacci();
    }

    @Test
    void fiboCurveTestAt5() {
        index = 5;
        assertEquals(fiboNumbers[index], fibonacci.fibo(index));
    }

    @Test
    void fiboCurveTestAt10() {
        index = 10;
        assertEquals(fiboNumbers[index], fibonacci.fibo(index));
    }

    @Test
    void fiboCurveTestAt12() {
        index = 12;
        assertEquals(fiboNumbers[index], fibonacci.fibo(index));
    }
}