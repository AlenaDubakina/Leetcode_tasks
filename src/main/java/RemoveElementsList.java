/*
Удалить все вхождения элемента из списка, сохраняя исходный список
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElementsList {
    public static List<String> removeElementsList(List<String> words, String element) {
        return words.stream().filter(el -> !el.equals(element)).toList();
    }

    public static List<String> removeElementsList2(List<String> words, String element) {
        List<String> copyList = new ArrayList<>(words);
        copyList.removeIf(el -> el.equals(element));
        return copyList;
    }

    public static void main(String[] args) {
        System.out.println(removeElementsList
                (Arrays.asList("apple", "banana", "apple", "orange", "apple"), "apple"));

        System.out.println(removeElementsList2
                (Arrays.asList("apple", "banana", "apple", "orange", "apple"), "apple"));
    }
}