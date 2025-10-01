/*
    Разделить строку на Map
    учтите, что ключи могут повторяться - брать последнее значение
 */

import java.util.HashMap;
import java.util.Map;

public class SplitStringMap {

    public static Map<String, Integer> splitStringMap(String input) {
        Map<String, Integer> strSplitMap = new HashMap<>();

        String[] strArr = input.split(",");
        for (String strs : strArr) {
            String[] str = strs.split("=");
            strSplitMap.put(str[0], Integer.parseInt(str[1]));
        }

        return strSplitMap;
    }

    public static void main(String[] args) {
        System.out.println(splitStringMap("a=1,b=2,c=3,a=4"));
    }
}