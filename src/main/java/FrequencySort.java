/*
Данную строку s отсортируйте в порядке убывания частоты встречаемости символов.
Частота встречаемости символа — это количество раз, когда он встречается в строке.
Верните отсортированную строку . Если ответов несколько, верните любой из них.
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencySort {
    public static String frequencySort(String s) {
        HashMap<Character, Integer> listMap = new HashMap<>();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            listMap.put(s.charAt(i), listMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        Map<Character, Integer> sortedMap = listMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        for (Map.Entry<Character, Integer> entry : sortedMap.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                result = entry.getKey() + result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(frequencySort("raaeaedere"));
    }
}