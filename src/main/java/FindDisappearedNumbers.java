import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FindDisappearedNumbers {
    /*
    Дан массив nums целых n чисел,
    где nums[i] входит в диапазон [1, n],
    вернуть массив всех целых чисел в диапазоне [1, n],
    которые не встречаются в nums .
     */

    public static List<Integer> findDisappearedNumbers(int[] c) {
        Arrays.sort(c);
        List<Integer> unicList = new ArrayList<>();
        for (int i = 0; i < c.length; i++) {
            if (Arrays.binarySearch(c, (1 + i)) < 0) {
                unicList.add(1 + i);
            }
        }
        return unicList;
    }

    public static List<Integer> findDisappearedNumbers2(int[] c) {
        HashSet<Integer> unicSet = Arrays.stream(c).boxed().collect(Collectors.toCollection(HashSet::new));
        List<Integer> unicList = new ArrayList<>();
        for (int i = 0; i < c.length; i++) {
            if (!unicSet.contains(1 + i)) {
                unicList.add(1 + i);
            }
        }
        return unicList;
    }

    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{1, 1}));
        System.out.println(findDisappearedNumbers2(new int[]{1, 1}));
    }
}