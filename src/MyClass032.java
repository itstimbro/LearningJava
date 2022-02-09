/**
 * The number of words occurrences in the text (draft)
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyClass032 {

    public static void main(String[] args) {
        String str = "Hello hello hi hello hi 26 wow wow";
        String s = str.toLowerCase();

        List<String> words = new ArrayList<>();
        String[] arrayOfWords = s.split("[^a-z0-9]*\\s");
        Collections.addAll(words, arrayOfWords);

        System.out.println(words);

        int numOfCurrentWord = 0;
        for (int i = 0; words.size() != 0; i++) {
            String currentWord = words.get(0);
            for (int j = 0; j < words.size(); j++) {
                if (words.get(j).equals(currentWord)) {
                    numOfCurrentWord++;
                    words.remove(j);
                    j--;
                }
            }
            System.out.println(currentWord + ": " + numOfCurrentWord);
            numOfCurrentWord = 0;
        }
    }

}
