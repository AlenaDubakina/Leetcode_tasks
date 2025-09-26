/*
    Преобразовать список в Map с условием:
    ключ - имя, значение - длина имени
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertListCondition {
    public static Map<String, Integer> convertToMap(List<String> names) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (String name : names) {
            resultMap.put(name, name.length());
        }
        return resultMap;
    }

    public static Map<String, Integer> convertToMapForEach(List<String> names) {
        Map<String, Integer> resultMap = new HashMap<>();

        names.forEach(name -> resultMap.put(name, name.length()));

        return resultMap;
    }

    public static void main(String[] args) {
        System.out.println(convertToMap(Arrays.asList("Alice", "Bob", "Charlie", "David")));
        System.out.println(convertToMapForEach(Arrays.asList("Alice", "Bob", "Charlie", "David")));
    }
}