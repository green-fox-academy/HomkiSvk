package sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {


    Sum sum;

    @BeforeEach
    void setUp() {
        sum = new Sum();
    }

    @Test
    void sumThemAll() {
        int[] elements = new int[]{5, 7, 10, 3, 5, 2, 6, 8};   //46
        assertEquals(46, sum.sumThemAll(elements));
    }

    @Test
    void testingEmptyListOnSumThemAll() {
        int[] elements = new int[]{};
        assertEquals(0,sum.sumThemAll(elements));
    }

    @Test
    void testingOneElementListOnSumThemAll() {
        int[] elements = new int[]{1};
        assertEquals(1,sum.sumThemAll(elements));
    }

    @Test
    void testingMultipleElementsListOnSumThemAll() {
        int[] elements = new int[]{5, 7, 10, 3, 5, 2, 6, 8};   //46
        assertEquals(46, sum.sumThemAll(elements));
    }

    @Test
    void testingNullListOnSumThemAll() {
        int[] elements = new int[]{};
        assertNull(sum.sumThemAll(elements));
    }
}