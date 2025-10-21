/*
    Дан массив чисел, вернуть true если внутри массива
    есть любые три числа последовательно с увеличением.
 */

public class SequenceNumbers {
    public static boolean isSequenceNumber(int[] nums) {
        if (nums.length < 3) return false;

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] < nums[i + 1] && nums[i + 1] < nums[i + 2]) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSequenceNumber(new int[]{8, 7, 5, 6, 6}));
        System.out.println(isSequenceNumber(new int[]{8, 7, 5, 6, 7}));
    }
}