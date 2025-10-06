/*
На вход приходит целое число.
Вернуть значение факториала.
Факториал от 0 существует и равен 1.
Решить через рекурсию.
 */

public class FactorialNumber {

    public static long factorial(int num) {
        if (num <= 1) return 1;
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}