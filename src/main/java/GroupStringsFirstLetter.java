/*
    Сгруппировать строки по первой букве
 */

import java.util.*;
import java.util.stream.Collectors;

public class GroupStringsFirstLetter {

    public static Map<Character, List<String>> groupStringsFirstLetter(List<String> words) {
        Map<Character, List<String>> groupWords = new HashMap<>();

        for (String word : words) {
            if (!groupWords.containsKey(word.charAt(0))) {
                groupWords.put(word.charAt(0), new ArrayList<>());
            }
            groupWords.get(word.charAt(0)).add(word);
        }

        return groupWords;
    }

    public static Map<Character, List<String>> groupStringsFirstLetterStream(List<String> words) {
        return words.stream()
                .collect(Collectors.groupingBy(
                        word -> word.charAt(0)
                ));
    }

    public static void main(String[] args) {
        System.out.println(groupStringsFirstLetter(
                Arrays.asList("apple", "banana", "avocado", "cherry", "blueberry")));

        System.out.println(groupStringsFirstLetterStream(
                Arrays.asList("apple", "banana", "avocado", "cherry", "blueberry")));
    }
}