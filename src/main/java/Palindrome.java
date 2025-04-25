public class Palindrome {
    /* Дано целое число x, вернуть
    true, если x - это палиндром, и
    false в противном случае.
    */

    public static boolean isPalindrome(int x) {
        StringBuilder builder = new StringBuilder("" + x);
        builder.reverse();
        String str = builder.toString();
        if (str.equals("" + x)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(565));
    }
}