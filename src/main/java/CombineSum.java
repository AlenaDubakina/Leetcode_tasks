/*
Объединить две мапы с суммированием оценок
 */

import java.util.HashMap;
import java.util.Map;

public class CombineSum {

    public static Map<String, Integer> combineSum(Map<String, Integer> map1, Map<String, Integer> map2) {

        Map<String, Integer> mapSum = new HashMap<>(map1);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            mapSum.put(entry.getKey(), mapSum.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }
        return mapSum;
    }

    public static Map<String, Integer> combineSumStream(Map<String, Integer> map1, Map<String, Integer> map2) {

        Map<String, Integer> mapSum = new HashMap<>(map1);

        map2.forEach((key, value) -> mapSum.merge(key, value, Integer::sum));

        return mapSum;
    }

    public static void main(String[] args) {
        System.out.println(combineSum
                (Map.of("a", 1, "b", 2, "c", 3),
                        Map.of("b", 4, "c", 5, "d", 6)));

        System.out.println(combineSumStream
                (Map.of("a", 1, "b", 2, "c", 3),
                        Map.of("b", 4, "c", 5, "d", 6)));
    }
}