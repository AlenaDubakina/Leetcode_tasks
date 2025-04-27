import java.util.Arrays;

public class PlusOne {
    /* Вам дано большое целое число,
    представленное в виде массива целых чисел digits,
    где каждая цифра digits[i]— это цифра целого числа.
    Цифры упорядочены от наиболее значимых к наименее значимым слева направо.
    Большое целое число не содержит начальных.
    Увеличьте большое целое число на единицу и верните полученный массив цифр .
    */

    public static int[] plusOne(int[] digits) {
        if (digits.length == 0) {
            int[] arr = {1};
            return arr;
        } else if (digits.length == 1 && digits[0] == 9) {
            int[] newArr = {1, 0};
            return newArr;
        }

        int count = 0;

        if (digits[digits.length - 1] == 9) {
            digits[digits.length - 1] = 0;

            for (int i = digits.length - 2; i >= 0; i--) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                    if (i == 0) {
                        count++;
                    }
                } else {
                    digits[i] = digits[i] + 1;
                    break;
                }
            }
        } else {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
        }

        if (count != 0) {
            int[] newArr = new int[digits.length + 1];
            newArr[0] = 1;

            for (int i = 0; i < digits.length; i++) {
                newArr[i + 1] = digits[i];
            }

            return newArr;
        } else {
            return digits;
        }
    }

    public static void main(String[] args) {
        int[] digits = {0};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}