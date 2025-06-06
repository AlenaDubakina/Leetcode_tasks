public class AddingBigNumbers {
    /*
    Нам нужно сложить большие числа, и нам нужна ваша помощь.
    Напишите функцию, которая возвращает сумму двух чисел.
    Входные числа являются строками, и функция должна возвращать строку.
     */

    public static String add(String a, String b) {
        String str = "";
        int length = a.length() > b.length() ? a.length() : b.length();
        int plus = 0;

        for (int i = 0; i < length; i++) {
            int sum = 0;
            if (a.length() - 1 - i < 0 && b.length() - 1 - i >= 0) {
                sum = Character.getNumericValue(b.charAt(b.length() - 1 - i)) + plus;
            } else if (a.length() - 1 - i >= 0 && b.length() - 1 - i < 0) {
                sum = Character.getNumericValue(a.charAt(a.length() - 1 - i)) + plus;
            } else {
                sum = Character.getNumericValue(a.charAt(a.length() - 1 - i)) + Character.getNumericValue(b.charAt(b.length() - 1 - i)) + plus;
            }
            plus = sum > 9 ? 1 : 0;
            if (sum > 9) {
                str = (sum - 10) + str;
                if (a.length() - 1 - i <= 0 && b.length() - 1 - i <= 0) {
                    str = plus + str;
                }
            } else {
                str = sum + str;
            }
        }

        while (str.charAt(0) == '0') {
            if (str.charAt(0) == '0') {
                str = str.substring(1, str.length());
            }
        }
        return str;
    }

    public static String addOther(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int x = 0;
        int i = 0;
        int n = Math.max(a.length(), b.length());
        while (i < n || x > 0) {
            if (i < a.length()) x += a.charAt(a.length() - 1 - i) - '0';
            if (i < b.length()) x += b.charAt(b.length() - 1 - i) - '0';
            sb.append(x % 10);
            x = x / 10;
            i++;
        }
        String f = sb.reverse().toString();
        return f.charAt(0) == '0' && f.length() > 1 ? f.substring(1, f.length()) : f;
    }

    public static void main(String[] args) {
        System.out.println(add("08562171110", "002"));
        System.out.println(addOther("08562171110", "002"));
    }
}