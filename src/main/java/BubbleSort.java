/*
    Реализовать сортировку пузырьком
 */

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    num = arr[i];
                    arr[i] = arr[j];
                    arr[j] = num;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        bubbleSort(new int[]{4, 3, 7, 8, 9, 5, 6, 5});
    }
}