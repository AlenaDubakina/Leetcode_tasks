/*
Дан массив целых чисел , nums отсортированный в порядке неубывания.
Вернуть массив квадратов каждого числа, отсортированный в порядке неубывания .
 */

import java.util.Arrays;

public class SortedSquares {
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static int[] sorted2Squares(int[] nums) {
        return Arrays.stream(nums).map(el -> el * el).sorted().toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
        System.out.println(Arrays.toString(sorted2Squares(new int[]{-4, -1, 0, 3, 10})));
    }
}