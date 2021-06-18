package extension;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
    int add(int a, int b) {
        return a + b;
    }

    int maxOfThree(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (c > a && c > b)
            return c;
        else return b;
    }

    int median(List<Integer> pool) {
        Collections.sort(pool);
        if (pool.size() % 2 == 0) {
            return pool.get((((pool.size()-1) / 2) + ((pool.size() + 1) / 2) / 2));
        } else
            return pool.get((pool.size() - 1) / 2);
    }

    // cant see anything wrong with this one
    boolean isVowel(char c) {
        return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
    }

    // cant see anything wrong with this one
    String translate(String hungarian) {
        String teve = hungarian;
        int length = teve.length();
        for (int i = 0; i < length; i++) {
            char c = teve.charAt(i);
            if (isVowel(c)) {
                teve = String.join(c + "v" + c, teve.split("" + c));
                i += 2;
                length += 2;
            }
        }
        return teve;
    }
}

// Check out the folder. There's a work file and a test file.

//  -  Run the tests, all 10 should be green (passing).
//  -  The implementations though are not quite good.
//  -  Create tests that'll fail, and will show how the implementations are wrong(You can assume that the implementation of join and split are good)
//  -  After creating the tests, fix the implementations
//  -  Check again, if you can create failing tests
//  -  Implement if needed