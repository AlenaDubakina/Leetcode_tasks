/*
Дан неотсортированный массив целых чисел.
Ваша задача — отсортировать массив по возрастанию, используя любой алгоритм сортировки.

Формат входных данных
В первой строке задаётся число N — количество элементов в массиве.
Во второй строке вводится массив из N целых чисел, разделённых пробелами.

Формат выходных данных
Программа должна вывести массив, отсортированный по возрастанию. Элементы массива разделяются пробелами.
 */

package vk_tasks;

import java.util.Arrays;

public class SortingArray {
    public static int[] sortingArray(int countArray, int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortingArray(4, new int[]{3, 2, 1, 8})));
    }
}