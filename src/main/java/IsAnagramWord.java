/*
    Проверить, является ли строка анаграммой
 */

import java.util.HashMap;
import java.util.Map;

public class IsAnagramWord {

    public static boolean isAnagram(String str1, String str2) {
        Map<Character, Integer> mapStr1 = new HashMap<>();
        Map<Character, Integer> mapStr2 = new HashMap<>();

        for (Character el : str1.toCharArray()) {
            mapStr1.put(el, mapStr1.getOrDefault(el, 0) + 1);
        }

        for (Character el : str2.toCharArray()) {
            mapStr2.merge(el, 1, Integer::sum);
        }

        return mapStr1.equals(mapStr2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("avaj", "vaaj"));
    }
}