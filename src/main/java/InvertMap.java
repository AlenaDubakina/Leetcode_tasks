import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    Инвертировать мапу (ключ ↔ значение)
    Создать новую мапу.
    Учесть возможные дубликаты значений!
 */
public class InvertMap {
    public static Map<Integer, List<String>> invertMap(Map<String, Integer> map) {
        Map<Integer, List<String>> newMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (!newMap.containsKey(entry.getValue())) {
                newMap.put(entry.getValue(), new ArrayList<>());
            }
            newMap.get(entry.getValue()).add(entry.getKey());
        }
        return newMap;
    }

    public static void main(String[] args) {
        System.out.println(invertMap(Map.of("a", 1, "b", 2, "c", 3, "d", 1)));
    }
}