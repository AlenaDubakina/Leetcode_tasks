/*
Написать функцию, которая находит корень числа
или ближайшее подходящее наименьшее целое число.
 */
package vk_tasks;

public class FindRootOfNumber {
    public static int findRootOfNumberBinarySearch(int target) {
        int left = 0;
        int right = target;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (middle * middle > target) {
                right = middle - 1;
            } else if (middle * middle < target) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        System.out.println(findRootOfNumberBinarySearch(16));
    }
}