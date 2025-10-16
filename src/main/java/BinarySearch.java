/*
    Реализовать бинарный поиск в отсортированном массиве
 */

public class BinarySearch {
    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int midRow = left + (right - left) / 2;
            if (nums[midRow] == target) return midRow;

            if (nums[midRow] < target) {
                left = midRow + 1;
            } else {
                right = midRow - 1;
            }
        }
        return -1;
    }
}