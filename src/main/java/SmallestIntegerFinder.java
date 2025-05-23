import java.util.Arrays;

public class SmallestIntegerFinder {
    /*
    Учитывая массив целых чисел, ваше решение должно найти наименьшее целое число.
    Например:
    Учитывая, что [34, 15, 88, 2]ваше решение вернется 2.
    Учитывая, что [34, -345, -1, 100]ваше решение вернется -345.
    Для целей этого ката можно предположить, что предоставленный массив не будет пустым.
     */

    public static int findSmallestInt(int[] args) {
        return Arrays.stream(args).min().getAsInt();
    }

    public static int findSmallestIntByCycle(int[] args) {
        int min = args[0];

        for (int i = 1; i < args.length; i++) {
            min = args[i] < min ? args[i] : min;
        }

        return min;
    }

    public static void main(String[] args) {
        int[] num = {78, 56, -2, 12, -8};
        System.out.println(findSmallestInt(num));
    }
}