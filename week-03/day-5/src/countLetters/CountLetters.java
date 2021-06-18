package countLetters;

import java.util.HashMap;

public class CountLetters {

    public HashMap<String, Integer> countLetters (String string) {
        HashMap<String, Integer> letterCounter = new HashMap<>();
        char [] letters = string.toCharArray();
        for (char character: letters ) {
            if (!letterCounter.containsKey(String.valueOf(character))){
                letterCounter.put(String.valueOf(character), 1);
            } else {
                letterCounter.put(String.valueOf(character), letterCounter.get(String.valueOf(character)) +1);
            }
        }
        return letterCounter;
    }

}
