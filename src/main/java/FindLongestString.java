/*
    Найти самую длинную строку в списке
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLongestString {

    public static String findLongestString(List<String> strings) {

        return strings.stream().max(Comparator.comparing(String::length)).orElse(null);
    }

    public static void main(String[] args) {
        System.out.println(findLongestString(Arrays.asList("a", "abc", "ab")));
    }
}