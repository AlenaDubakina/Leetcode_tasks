/*
Дан массив целых чисел. Ваша задача — определить, существует ли элемент,
который встречается больше половины раз в массиве.
Если такой элемент существует, вернуть его. Если такого элемента нет, вернуть  -1 .

Формат входных данных
В первой строке задаётся число N — размер массива (количество элементов).
Во второй строке вводится массив из N целых чисел, разделённых пробелами.

Формат выходных данных
Программа должна вывести:
• элемент массива, который встречается больше половины раз
• -1 , если такого элемента нет.
 */

package vk_tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MainElement {
    public static int mainElement(int countEl, int[] arrNum) {
        Map<Integer, Integer> mapArray = new HashMap<>();

        Arrays.stream(arrNum).forEach( el -> {
            mapArray.merge(el, 1, Integer::sum);
        });

        for(Map.Entry<Integer, Integer> arr: mapArray.entrySet()) {
            if(arr.getValue() > countEl /2) return arr.getKey();
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(mainElement(7, new int[] {7, 7, 8, 8, 8, 8, 9}));
    }
}