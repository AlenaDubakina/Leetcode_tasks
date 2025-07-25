import java.util.Arrays;

public class TwoSum {
    /*
    Дан массив целых чисел nums и целое число target,
    вернуть индексы двух чисел так, чтобы их сумма давала target.
    Вы можете предположить, что каждый вход будет иметь ровно одно решение,
    и вы не можете использовать один и тот же элемент дважды.
    Вы можете возвращать ответ в любом порядке.
     */

    public static int[] twoSum(int[] nums, int target) {
        if (nums.length == 2)
            return new int[]{0, 1};
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
    }
}