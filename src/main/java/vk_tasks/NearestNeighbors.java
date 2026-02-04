/*
Дан отсортированный массив положительных целых чисел.
Необходимо найти такую пару соседних элементов,
у которых абсолютная разница минимальна.
*/
package vk_tasks;

public class NearestNeighbors {

    public static String nearestNeighbors(int countEl, int[] nums) {
        int num1 = nums[0];
        int num2 = nums[1];
        int def = num2 - num1;

        for (int i = 1; i < countEl - 1; i++) {
            if (nums[i + 1] - nums[i] < def) {
                num1 = nums[i];
                num2 = nums[i + 1];
            }
        }

        return "" + num1 + " " + num2;
    }

    public static void main(String[] args) {
        System.out.println(nearestNeighbors(4, new int[]{1, 3, 4, 11}));
    }
}