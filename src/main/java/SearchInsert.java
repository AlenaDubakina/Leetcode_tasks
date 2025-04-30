import java.util.Arrays;

public class SearchInsert {
    /*
    Дано отсортированное множество различных целых чисел и целевое значение,
    вернуть индекс, если цель найдена.
    Если нет, вернуть индекс, где бы он был, если бы он был вставлен по порядку.
     */

    public static int searchInsert(int[] nums, int target) {
        int indexSearch = Arrays.binarySearch(nums, target);

        if (indexSearch >= 0) {
            return indexSearch;
        } else {
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] < target) {
                    return i + 1;
                }
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsert(nums, 5));
    }
}