/*
Разделить на два списка: четные и нечетные числа
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitListTwoCondition {

    public static void splitListTwoConditionWithStream(List<Integer> numbers) {
        List<Integer> oddNumber = numbers.stream().filter(el -> el % 2 != 0).toList();
        List<Integer> evenNumber = numbers.stream().filter(el -> el % 2 == 0).toList();
        System.out.println(oddNumber);
        System.out.println(evenNumber);
    }

    public static void splitListTwoConditionWithFor(List<Integer> numbers) {
        List<Integer> oddNumber = new ArrayList<>();
        List<Integer> evenNumber = new ArrayList<>();
        for (Integer el : numbers) {
            if (el % 2 == 0) {
                evenNumber.add(el);
            } else {
                oddNumber.add(el);
            }
        }
        System.out.println(oddNumber);
        System.out.println(evenNumber);
    }

    public static void main(String[] args) {
        splitListTwoConditionWithStream(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        splitListTwoConditionWithFor(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}