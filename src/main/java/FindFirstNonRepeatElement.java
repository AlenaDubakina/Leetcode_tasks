/*
    Найти первый неповторяющийся символ
 */

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatElement {
    public static Character findNonRepeatElement(String word) {
        Map<Character, Integer> mapChar = new HashMap<>();

        for (Character el : word.toCharArray()) {
            mapChar.merge(el, 1, Integer::sum);
        }
        return mapChar.entrySet()
                .stream()
                .filter(el -> el.getValue() == 1)
                .map(el -> el.getKey())
                .findFirst()
                .orElse(null);
    }

    public static void main(String[] args) {
        System.out.println(findNonRepeatElement("swiss"));
        System.out.println(findNonRepeatElement("aabbcc"));
    }
}