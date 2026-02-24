/*
Необходимо найти и сгруппировать
слова-анаграммы вместе
 */

package vk_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayOfAnagrams {
    public static List<List<String>> arrayOfAnagrams(List<String> words) {
        HashMap<String, List<String>> mapAnagram = new HashMap<>();

        for (String word : words) {
            char[] el = word.toCharArray();
            Arrays.sort(el);
            String str = String.valueOf(el);

            if (!mapAnagram.containsKey(str)) {
                mapAnagram.put(str, new ArrayList<>());
            }

            mapAnagram.get(str).add(word);
        }

        return mapAnagram.values().stream().toList();
    }

    public static List<List<String>> arrayOfAnagramsMap(List<String> words) {
        return words.stream().collect(Collectors.groupingBy(String::valueOf)).values().stream().toList();
    }


    public static void main(String[] args) {
        System.out.println(arrayOfAnagrams(Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat")));
        System.out.println(arrayOfAnagramsMap(Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat")));
    }
}