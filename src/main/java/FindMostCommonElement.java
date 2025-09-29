/*
    Найти наиболее частый элемент
 */

import java.util.*;

public class FindMostCommonElement {
    public static List<String> findMostCommonElement(List<String> words) {
        Map<String, Integer> wordsMap = new HashMap<>();

        words.forEach(word -> wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1));

        int max = Collections.max(wordsMap.values());

        List<String> maxCommon = wordsMap.entrySet()
                .stream()
                .filter(el -> el.getValue() == max)
                .map(Map.Entry::getKey)
                .toList();

        return maxCommon;
    }

    public static void main(String[] args) {
        System.out.println(findMostCommonElement(
                Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple", "banana")));
    }
}