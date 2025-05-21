import java.util.Arrays;

public class KataCountPositivesSumNegatives {
    /*
    Дан массив целых чисел.
    Верните массив, где первый элемент — количество положительных чисел,
    а второй элемент — сумма отрицательных чисел.
    0 не является ни положительным, ни отрицательным.
    Если входные данные являются пустым массивом или равны нулю, вернуть пустой массив.
     */

    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null) return new int[]{};
        int sumPositive = Arrays.stream(input).reduce(0, (x, y) -> y > 0 ? x + 1 : x);
        int sumNegative = Arrays.stream(input).reduce(0, (x, y) -> y < 0 ? x + y : x);
        if (sumPositive == 0 && sumNegative == 0) return new int[]{};
        return new int[]{sumPositive, sumNegative};
    }

    public static void main(String[] args) {
        int[] input = null;
        System.out.println(Arrays.toString(countPositivesSumNegatives(input)));
    }
}