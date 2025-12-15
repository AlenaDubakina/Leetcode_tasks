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

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 4, 5, 6, 7, 8, 9, 11, 12, 25);
        List<String> strList = Arrays.asList("at", "food", "horse", "books", "cat", "dogs", "at", "dogs", "food");
        System.out.println(filterEvenNumberList(nums));
        System.out.println(averageList(nums));
        System.out.println(sortListLengthString(strList));
        System.out.println(uniqueElements(strList));
        System.out.println(countElementsMoreTen(nums));
    }
}