/*
Учёные провели ряд экспериментов, но из-за неисправности
оборудования некоторые результаты оказались ошибочными.
Ошибочные результаты представлены числом element.
Ваша задача — удалить все вхождения числа element из массива,
сохранив порядок остальных чисел.
 */

package vk_tasks;

public class ExperimentCleaning {
    public static String experimentCleaning(String n, String elements, String num) {
        String[] arrElements = elements.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < arrElements.length; i++) {
            if (!arrElements[i].equals(num)) {
                stringBuilder.append(arrElements[i]).append(" ");
            }
        }

        return stringBuilder.toString().trim();
    }

    public static void main(String[] args) {

        System.out.println(experimentCleaning("7", "1 2 -1 4 5 -1 6", "-1"));
    }
}