public class IsPowerOfThree {
    /*
    Дано целое число n, вернуть, true
    если оно является степенью трех.
    В противном случае вернуть false .
    Целое число nявляется степенью числа три,
    если существует целое число x такое, что n == 3 в степени x.
     */

    public static boolean isPowerOfThree(int n) {
        double m = (double) n;
        while (m > 1) {
            m = m/3;
        }
        return m == 1 ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(81));
    }
}