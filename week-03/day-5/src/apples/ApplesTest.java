package apples;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplesTest {

    private Apples testApples;

    @BeforeEach
    public void setUp() {
        testApples = new Apples();
    }

    @Test
    void getAppleValueTesting() {
        assertEquals("apple", testApples.getApple());
    }
}