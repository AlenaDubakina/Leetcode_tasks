import java.util.Arrays;

public class SumTwoSmallestNumbers {
    /*
    Создайте функцию, которая возвращает сумму двух наименьших положительных чисел,
    заданных массивом из минимум 4 положительных целых чисел.
    Не будут переданы числа с плавающей точкой или неположительные целые числа.
    Для Java эти целые числа будут иметь двойную точность (long).
     */

    public static long sumTwoSmallestNumbers(long[] numbers) {
        Arrays.sort(numbers);
        return numbers[0] + numbers[1];
    }

    public static void main(String[] args) {
        System.out.println(sumTwoSmallestNumbers(new long[]{23, 71, 33, 82, 1}));
    }
}