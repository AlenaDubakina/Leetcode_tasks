import java.util.Arrays;

public class MissingNumber {
    /*
    Дан массив nums, содержащий nразличные числа в диапазоне [0, n],
    вернуть единственное число в диапазоне, отсутствующее в массиве.
     */

    public static int missingNumber(int[] nums) {
        int searchNum = 0;
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length; i++) {
            if (Arrays.binarySearch(nums, i) < 0) {
                return i;
            }
        }
        return searchNum;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }
}