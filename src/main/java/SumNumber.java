/*
    Написать метод, который возвращает сумму
    цифр числа, пришедшего на вход
 */

public class SumNumber {

    public static Integer sumNumber(int num) {
        String strNum = "" + num;
        int sum = 0;
        for (int i = 0; i < strNum.length(); i++) {
            sum += Integer.parseInt("" + strNum.charAt(i));
        }

        return sum;
    }

    public static Integer sumNumberAbs(int num) {
        int number = Math.abs(num);
        if (number < 10) return num;
        return number % 10 + sumNumber(number / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumNumber(234));
        System.out.println(sumNumberAbs(234));
    }
}