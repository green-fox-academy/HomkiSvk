package anagram;

import java.util.Arrays;

public class Anagram {

    public boolean isAnagram (String a, String b) {
        char [] wordA = a.toCharArray();
        char [] wordB = b.toCharArray();
        Arrays.sort(wordA);
        Arrays.sort(wordB);

        return Arrays.equals(wordA, wordB);
    }
}
