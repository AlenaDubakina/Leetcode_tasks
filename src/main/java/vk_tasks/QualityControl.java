/*
На складе хранятся контейнеры с товарами, каждому из которых присвоен номер.
Чётный номер означает, что контейнер прошёл проверку качества.
Ваша задача — найти номер последнего проверенного контейнера (последнего чётного числа в массиве).
Если в массиве нет чётных чисел, вернуть -1.
 */
package vk_tasks;

public class QualityControl {

    public static int qualityControl(int countOfContainers, int[] containers) {

        for (int i = containers.length - 1; i >= 0; i--) {
            if (containers[i] % 2 == 0) return containers[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(qualityControl(9, new int[]{7, 3, 4, 1, 10, 11, 12, 19, 21}));
    }
}