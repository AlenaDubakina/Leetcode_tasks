public class IsPowerOfFour {
    /*
    Дано целое число n, вернуть, true
    если оно является степенью четырех.
    В противном случае вернуть false.
    Целое число n является степенью числа четыре,
    если существует целое число x такое, что n == 4 в степени x.
     */

    public static boolean isPowerOfFour(int n) {
        double m = (double) n;
        while (m > 1) {
            m = m / 4;
        }
        return m == 1 ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(256));
    }
}