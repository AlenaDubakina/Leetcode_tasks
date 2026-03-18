import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
1. Реверс строки (без использования StringBuilder.reverse())
Суть: Написать метод, который переворачивает строку задом наперед.
Зачем: Проверка понимания работы с массивом символов (char[]) и циклами.
Усложнение: Сделать это "in-place" (меняя символы местами внутри массива) за один проход.

2. Поиск первого неповторяющегося символа
Суть: Дана строка (например, “automation”).
Нужно найти первый символ, который встречается в ней всего один раз (в данном случае это “u”).

3. Поиск дубликатов в массиве/списке
Суть: Дан массив чисел. Нужно вернуть список только тех чисел, которые повторяются.

4. FizzBuzz (Классика)
Суть: Вывести числа от 1 до 100. Если число делится на 3 — пишем Fizz, на 5 — Buzz, на оба — FizzBuzz.
Зачем: Проверка базового синтаксиса и аккуратности условий.
Усложнение: Попробуй написать это с использованием Java Stream API.

5. Проверка на Палиндром
Суть: Написать функцию, которая проверяет, читается ли слово одинаково
в обоих направлениях (например, “madam”, “racecar”).
Зачем: Базовая алгоритмическая логика.
Усложнение: Сделать проверку игнорируя регистр и знаки препинания
(например, "А роза упала на лапу Азора").

 */
public class GoogleTasks {

    public static String reverseString(String str) {
        char[] arrChar = str.toCharArray();
        char el;

        for (int i = 0; i < arrChar.length / 2; i++) {
            el = arrChar[i];
            arrChar[i] = arrChar[arrChar.length - 1 - i];
            arrChar[arrChar.length - 1 - i] = el;
        }

        return new String(arrChar);
    }

    public static char uniqElement(String str) {
        LinkedHashMap<Character, Integer> countElement = new LinkedHashMap<>();

        for (char el : str.toCharArray()) {
            countElement.merge(el, 1, Integer::sum);
        }

        return countElement.entrySet().stream()
                .filter(el -> el.getValue() == 1)
                .map(el -> el.getKey())
                .findFirst()
                .orElse(' ');
    }

    public static Set<Integer> duplicatesArray(int[] nums){
        Set<Integer> uniqArr = new HashSet<>();
//        Set<Integer> duplicates = new HashSet<>();
//        for(int el: nums) {
//            if(!uniqArr.add(el)) {
//                duplicates.add(el);
//            }
//        }
//        return duplicates;

        return Arrays.stream(nums)
                .filter(el -> !uniqArr.add(el))
                .boxed()
                .collect(Collectors.toSet());
    }

    public static void fizzBuzz(){
        IntStream.rangeClosed(1, 15).forEach(el -> {
            System.out.println(el);
            if(el % 3 == 0 && el % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if(el % 3 == 0) {
                System.out.println("Fizz");
            } else if(el % 5 == 0) {
                System.out.println("Buzz");
            }
        });
    }

    public static boolean palindrome(String str){
        String update = str.toLowerCase().replaceAll("[^a-zа-я0-9]", "");
        return new StringBuilder(update).reverse().toString().equals(update);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("saratara"));
        System.out.println(uniqElement("automation"));
        System.out.println(duplicatesArray(new int[]{1, 2, 3, 1, 2, 5,1}));
        fizzBuzz();
        System.out.println(palindrome("А роза упала на лапу Азора"));
    }
}