import java.util.*;
import java.util.stream.Collectors;

public class StreamTask {
     /*
    Отфильтруй список чисел, оставив только чётные.
    */

    public static List<Integer> filterEvenNumberList(List<Integer> nums) {
        return nums.stream().filter(el -> el % 2 == 0).collect(Collectors.toList());
    }

      /*
    Найди среднее значение списка с помощью стримов.
     */

    public static double averageList(List<Integer> nums) {
        return nums.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
    }

      /*
    Отсортируй список строк по длине.
     */

    public static List<String> sortListLengthString(List<String> strList) {
        return strList.stream()
                .sorted(Comparator.comparing(String::length)
                        .thenComparing(Comparator.naturalOrder()))
                .collect(Collectors.toList());
    }

       /*
    Собери уникальные элементы в Set.
     */

    public static Set<String> uniqueElements(List<String> strList) {
//        return strList.stream().collect(Collectors.toSet());
        return new HashSet<>(strList);
    }

     /*
    Подсчитай количество элементов больше 10.
     */

    public static long countElementsMoreTen(List<Integer> nums) {
        return nums.stream().filter(el -> el > 10).count();
    }

    /*
    Верни квадраты уникальных чисел, отсортированные по возрастанию.
     */

    public static List<Integer> squareNumbers(List<Integer> nums) {
        return nums.stream().distinct().map(num -> num * num).sorted().collect(Collectors.toList());
    }

    /*
    Дан список строк.
    Верни Map, где:
    ключ — длина строки
    значение — список строк этой длины
     */

    public static Map<Integer, List<String>> mapListString(List<String> words) {
        return words.stream().collect(Collectors.groupingBy(String::length));
    }

    /*
    Проверь, все ли числа положительные.
     */

    public static boolean positiveNums(List<Integer> nums) {
        return nums.stream().allMatch(num -> num > 0);
    }

    /*
    Есть список строк.
    Верни первую строку, которая длиннее 5 символов.
     */

    public static String firstString(List<String> stringList) {
        return stringList.stream().filter(word -> word.length() > 5).findFirst().orElse(null);
    }

    /*
    Дан список чисел.
    Найди второе по величине число.
     */

    public static Integer secondNumber(List<Integer> nums) {
        return nums.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
    }

    /*
    Дан список строк.
    Посчитай общее количество символов во всех строках.
     */

    public static Integer sumCharWords(List<String> words) {
//        return words.stream().collect(Collectors.joining()).length();

        return words.stream().mapToInt(String::length).sum();
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 2, 2, 4, 4, 5, 5, 6, 4, 5, 6, 7, 8, 9, 11, 12, 25);
        List<String> strList = Arrays.asList("at", "food", "horses", "books", "cat", "dogs", "at", "dogs", "food");
        System.out.println(filterEvenNumberList(nums));
        System.out.println(averageList(nums));
        System.out.println(sortListLengthString(strList));
        System.out.println(uniqueElements(strList));
        System.out.println(countElementsMoreTen(nums));
        System.out.println(squareNumbers(nums));
        System.out.println(mapListString(strList));
        System.out.println(positiveNums(nums));
        System.out.println(firstString(strList));
        System.out.println(secondNumber(nums));
        System.out.println(sumCharWords(strList));
    }
}