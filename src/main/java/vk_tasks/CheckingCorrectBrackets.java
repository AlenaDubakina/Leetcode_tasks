/*
    Дана строка из символов ()[]{}.
    Нужно проверить, корректна ли последовательность.

    Пример
    "()[]{}" → true
    "(]" → false
    "({[]})" → true
*/
package vk_tasks;

import java.util.ArrayDeque;
import java.util.Deque;

public class CheckingCorrectBrackets {
    public static boolean checkingBrackets(String brackets) {
        if (brackets.length() % 2 != 0) return false;

        Deque<Character> stackBrackets = new ArrayDeque<>();

        for (char el : brackets.toCharArray()) {

            if (el == '{' || el == '(' || el == '[') {
                stackBrackets.push(el);
            } else {
                if (stackBrackets.isEmpty()) return false;

                char top = stackBrackets.pop();
                if (!stackBrackets.isEmpty()) {
                    if ((top == '(' && el != ')') ||
                            (top == '{' && el != '}') ||
                            (top == '[' && el != ']')) {
                        return false;
                    }
                }
            }
        }

        return stackBrackets.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(checkingBrackets("({[]})"));
        System.out.println(checkingBrackets("({[})"));
    }
}