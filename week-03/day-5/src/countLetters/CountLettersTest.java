package countLetters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {

    public CountLetters letters;
    String wordPlay;

    @BeforeEach
    void setUp() {
        letters = new CountLetters();
        wordPlay = "banana";
    }

    @Test
    void countLettersHasAllKeyValues() {
        assertTrue(letters.countLetters(wordPlay).containsKey("b"));
        assertTrue(letters.countLetters(wordPlay).containsKey("a"));
        assertTrue(letters.countLetters(wordPlay).containsKey("n"));
    }

    @Test
    void setLettersHasAllValuesCorrect() {
        assertEquals(1, letters.countLetters(wordPlay).get("b"));
        assertEquals(3, letters.countLetters(wordPlay).get("a"));
        assertEquals(2, letters.countLetters(wordPlay).get("n"));
    }
}