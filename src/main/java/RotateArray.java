/*
    Повернуть массив на k позиций вправо
    Пример: [1,2,3,4,5], k=2 → [4,5,1,2,3]
 */

import java.util.Arrays;

public class RotateArray {

    public static int[] rotateArray(int[] nums, int k) {
        if (k == 0) return nums;

        if (k > nums.length) {
            k = k % nums.length;
        }

        int[] rotateArray = new int[nums.length];

        for (int i = 0; i < k; i++) {
            rotateArray[i] = nums[nums.length - k + i];
        }

        for (int i = k; i < nums.length; i++) {
            rotateArray[i] = nums[i - k];
        }

        return rotateArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateArray(new int[]{1, 2, 3, 4, 5}, 2)));
        System.out.println(Arrays.toString(rotateArray(new int[]{1, 2, 3, 4, 5}, 6)));
    }
}