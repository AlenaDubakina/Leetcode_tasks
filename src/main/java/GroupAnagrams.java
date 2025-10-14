/*
    Сгруппировать слова по анаграммам
    Пример: ["eat", "tea", "tan", "ate", "nat", "bat"]
    → [["eat","tea","ate"], ["tan","nat"], ["bat"]]
 */

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(List<String> words) {
        Map<String, List<String>> mapWords = new HashMap<>();
        for (String word : words) {
            char[] arrChar = word.toCharArray();
            Arrays.sort(arrChar);
            String str = String.valueOf(arrChar);

            if (!mapWords.containsKey(str)) {
                mapWords.put(str, new ArrayList<>());
            }

            mapWords.get(str).add(word);
        }

        List<List<String>> result = mapWords.values().stream().toList();

        return result;
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat")));
    }
}