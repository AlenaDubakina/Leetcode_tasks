import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
    Найти ключ с максимальным значением
 */

public class FindKeyMaximumValue {

    public static List<String> findKeyMaximumValue(Map<String, Integer> map) {
        List<String> maxKey = new ArrayList<>();
        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            maxValue = entry.getValue() > maxValue ? entry.getValue() : maxValue;
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValue) {
                maxKey.add(entry.getKey());
            }
        }

        return maxKey;
    }

    public static List<String> findKeyMaximumValueStream(Map<String, Integer> map) {
        int maxValue = map.values().stream().max(Integer::compare).get();
        List<String> maxKey = map.entrySet()
                .stream()
                .filter(el -> el.getValue() == maxValue)
                .map(Map.Entry::getKey)
                .toList();

        return maxKey;
    }

    public static void main(String[] args) {
        System.out.println(findKeyMaximumValue
                (Map.of("John", 25, "Alice", 30, "Bob", 30, "Charlie", 25)));
        System.out.println(findKeyMaximumValueStream
                (Map.of("John", 25, "Alice", 30, "Bob", 30, "Charlie", 25)));
    }
}