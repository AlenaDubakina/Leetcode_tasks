/*
    Проверить, является ли строка палиндромом
 */

public class StringIsPalindrome {

    public static boolean isPalindrome(String str) {
        StringBuilder stringBuilder = new StringBuilder(str.toLowerCase());

        return stringBuilder.reverse().toString().equals(str.toLowerCase());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("radar"));
    }
}