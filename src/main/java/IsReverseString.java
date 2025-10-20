public class IsReverseString {
    /*
    Напишите функцию, которая переворачивает строку.
    Входная строка представлена массивом символов s.
    Это необходимо сделать, изменив входной массив
    на месте с использованием O(1)дополнительной памяти.
    */

    public static void reverseString(char[] s) {
        char temp;
        for (int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }

        System.out.println(s);
    }

    public static void main(String[] args) {
        reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
        reverseString(new char[]{'h', 'e', 'l', 'l', 'o', '!'});
    }
}