/*
    Для каждого элемента вернуть произведение всех элементов кроме него самого
 */

import java.util.Arrays;

public class ProductArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] multiArray = new int[nums.length];
        int countZero = (int) Arrays.stream(nums).filter(el -> el == 0).count();

        if (countZero > 1) {
            for (int i = 0; i < multiArray.length; i++) {
                multiArray[i] = 0;
            }
        }
        int multi = Arrays.stream(nums).filter(el -> el != 0).reduce(1, (mult, el) -> mult *= el);
        if (countZero == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    multiArray[i] = 0;
                } else {
                    multiArray[i] = multi;
                }
            }
        }
        if (countZero == 0) {
            for (int i = 0; i < nums.length; i++) {
                multiArray[i] = multi / nums[i];
            }
        }

        return multiArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
    }
}