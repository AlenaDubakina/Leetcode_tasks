public class Reverse {
    /*
    Дано знаковое 32-битное целое число x, вернуть xс обратными цифрами.
    Если обратный порядок цифр x приводит к выходу значения за пределы знакового
    32-битного целого числа , вернуть 0.
     */

    public static int reverse(int x) {
        boolean el = false;
        String str = "" + x;
        StringBuilder stringBuilder;

        if (x < 0) {
            el = true;
            stringBuilder = new StringBuilder(str.substring(1));
        } else {
            stringBuilder = new StringBuilder(str);
        }

        stringBuilder.reverse();
        int num = (Long.parseLong(stringBuilder.toString()) > Integer.MAX_VALUE)
                || (Long.parseLong(stringBuilder.toString()) < Integer.MIN_VALUE)
                ? 0
                : Integer.parseInt(stringBuilder.toString());
        if (el) {
            num = -num;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
    }
}