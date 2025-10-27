/*
    Сгруппировать строки по их длине
 */

import java.util.*;
import java.util.stream.Collectors;

public class StringGroupingLength {
    public static Map<Integer, List<String>> groupByLengthSorted(List<String> strings) {

        return strings.stream().collect(Collectors.groupingBy(el -> el.length()));
    }

    public static Map<Integer, List<String>> groupByLengthSortedWithFor(List<String> strings) {
        Map<Integer, List<String>> resultMap = new HashMap<>();

        for (String str : strings) {
            if (!resultMap.containsKey(str.length())) {
                resultMap.put(str.length(), new ArrayList<>());
            }
            resultMap.get(str.length()).add(str);
        }

        return resultMap;
    }

    public static void main(String[] args) {
        System.out.println(groupByLengthSorted(Arrays.asList("apple", "dog", "son", "cat", "frog", "cats")));
        System.out.println(groupByLengthSortedWithFor(Arrays.asList("apple", "dog", "son", "cat", "frog", "cats")));
    }
}