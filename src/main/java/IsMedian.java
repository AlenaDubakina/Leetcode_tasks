/*
    Написать метод, который будет возвращать значение
    медианы ряда целых цисел, поданных на вход.
    Медианой ряда чисел называется число,
    стоящее посередине упорядоченного по возрастанию ряда чисел
    - в случае, если количество чисел нечетное.
    Если же количество чисел в ряду четно, то медианой ряда является
    полусумма двух стоящих посередине чисел упорядоченного по возрастанию ряда
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IsMedian {

    public static double isMedian(List<Integer> nums) {
        Collections.sort(nums);

        if (nums.size() % 2 != 0) {
            return nums.get(nums.size() / 2);
        }
        double sum = nums.get(nums.size() / 2 - 1) + nums.get(nums.size() / 2);

        return sum / 2;
    }

    public static double isMedianArr(int[] nums) {
        Arrays.sort(nums);

        if (nums.length % 2 != 0) {
            return nums[(nums.length / 2)];
        }
        double sum = nums[(nums.length / 2 - 1)] + nums[(nums.length / 2)];

        return sum / 2;
    }

    public static void main(String[] args) {
        System.out.println(isMedian(Arrays.asList(1, 3, 3, 6, 7, 8, 9)));
        System.out.println(isMedian(Arrays.asList(1, 3, 6, 7, 8, 9)));

        System.out.println(isMedianArr(new int[]{1, 3, 3, 6, 7, 8, 9}));
        System.out.println(isMedianArr(new int[]{1, 3, 6, 7, 8, 9}));
    }
}