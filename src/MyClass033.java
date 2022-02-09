/**
 * The number of words occurrences in the text (refactored)
 */

import java.util.*;

public class MyClass033 {

    public static Map<String, Integer> countAllWords(String text) {
        if (text == null || text.isBlank()) {
            return new HashMap<>();
        }

        Map<String, Integer> countByWord = new HashMap<>();
        List<String> words = Arrays.asList(text.toLowerCase().split("[^a-z0-9]*\\s"));

        for (String word: words) {
            if (!countByWord.containsKey(word)) {
                countByWord.put(word, countString(word, words));
            }
        }

        return countByWord;
    }

    private static int countString(String string, List<String> strings) {
        int count = 0;
        for (String s: strings) {
            if (s.equals(string)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countAllWords("Hello hello hi hello hi 26 wow wow"));
    }

}
