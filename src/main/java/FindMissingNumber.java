/*
    Дан массив чисел от 1 до n с одним пропущенным числом.
    Найти пропущенное число.
 */

import java.util.Arrays;

public class FindMissingNumber {

    public static int findMissingNumber(int[] nums, int n) {

        if (nums[0] != 1) return 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 != nums[i + 1]) {
                return nums[i] + 1;
            }
        }
        return n;
    }

    public static int findMissingNumberVar2(int[] nums, int n) {
        int sum = Arrays.stream(nums).reduce(0, (acc, el) -> acc += el);
        int expectedSum = n * (n + 1) / 2;

        return expectedSum - sum;

    }

    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[]{1, 2, 4, 5}, 5));
        System.out.println(findMissingNumberVar2(new int[]{1, 2, 4, 5}, 5));
    }
}