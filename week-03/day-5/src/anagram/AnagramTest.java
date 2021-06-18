package anagram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    String wordA;
    String wordB;
    Anagram anagram;

    @BeforeEach
    void setUp() {
        anagram = new Anagram();
        wordA = "apples";
        wordB = "saplep";
    }

    @Test
    void isAnagramWorking() {
        assertTrue(anagram.isAnagram(wordA, wordB));
    }
}