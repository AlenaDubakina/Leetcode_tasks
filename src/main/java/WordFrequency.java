/*
    Подсчитать частоту слов в строке
 */

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static Map<String, Integer> wordFrequency(String str) {
        Map<String, Integer> mapStr = new HashMap<>();

        for (String word : str.split(" ")) {
            mapStr.merge(word, 1, Integer::sum);
        }

        return mapStr;
    }

    public static void main(String[] args) {
        System.out.println(wordFrequency("Подсчитать частоту слов в строке слов"));
    }
}