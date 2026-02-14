/*
Дан отсортированный по возрастанию массив целых чисел и заданное число.
Если заданное число уже находится в массиве, верните его индекс.
Если числа в массиве нет, верните индекс, где оно должно находиться,
чтобы сохранить порядок сортировки.

Формат входных данных
В первой строке задаётся число N — количество элементов в массиве.
Во второй строке вводится массив из N целых чисел, разделённых пробелами.
В третьей строке задаётся число target, для которого нужно найти индекс.

Формат выходных данных
Программа должна вывести одно число — индекс числа target,
если оно уже есть в массиве, или индекс,
где оно должно находиться для сохранения порядка сортировки.
 */
package vk_tasks;

public class SearchForPosition {
    public static int searchPosition(int countNumber, int[] arrNum, int target) {
        int left = 0;
        int right = arrNum.length - 1;

        while (left <= right) {
            int middle = (left + (right - left) / 2);

            if (target == arrNum[middle]) {
                return middle;
            }
            if (arrNum[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println(searchPosition(5, new int[]{5, 7, 9, 11, 13}, 6));
    }
}