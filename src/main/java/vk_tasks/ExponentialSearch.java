/*
Дан отсортированный по возрастанию массив целых чисел и некоторое целое число.
Ваша задача — найти минимальный диапазон индексов (подмассив), в котором может
находиться заданное число. Используйте метод экспоненциального поиска.

Формат входных данных:
В первой строке задаётся число N — количество элементов в массиве.
Во второй строке вводится массив из N целых чисел, разделённых пробелами.
В третьей строке задаётся целое число target, для которого нужно найти диапазон.

Формат выходных данных:
Программа должна вывести два числа через пробел, представляющие диапазон индексов,
где может находиться число target. Если число находится в массиве,
это должен быть диапазон, содержащий индекс числа. Если число отсутствует,
диапазон должен содержать индексы, где оно могло бы быть вставлено.
 */

package vk_tasks;

import java.util.Arrays;

public class ExponentialSearch {
    public static int[] exponentialSearch(int countNumber, int[] arrNum, int target) {
        if (arrNum[0] == target) return new int[]{0, 0};
        int border = 1;
        int lastIndexArr = arrNum.length - 1;
        while (border <= lastIndexArr && target > arrNum[border]) {
            border = border * 2;
        }
        return new int[]{border / 2, Math.min(border, lastIndexArr)};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(exponentialSearch(11, new int[]{8, 11, 12, 16, 18, 21, 33, 36, 48, 54, 63}, 16)));
    }
}