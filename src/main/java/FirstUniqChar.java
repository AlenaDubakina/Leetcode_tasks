/*
Для заданной строки s найти первый неповторяющийся символ и вернуть его индекс.
Если он не существует, вернуть -1.
 */

import java.util.HashMap;

public class FirstUniqChar {
    public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean el = false;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    el = !el;
                    break;
                }
            }
            if (!el) {
                return i;
            }
        }

        return -1;
    }

    public static int firstUniqCharHashMap(String s) {
        HashMap<Character, Integer> arr = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            arr.put(s.charAt(i), arr.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (arr.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqCharHashMap("leetcode"));
    }
}