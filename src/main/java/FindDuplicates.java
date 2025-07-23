import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicates {
    /*
    Дан массив целых чисел nums длины n, в котором все целые числа nums
    попадают в диапазон [1, n] и каждое целое число встречается не более двух раз,
    вернуть массив всех целых чисел, которые встречаются дважды.
    Вам необходимо написать алгоритм, который выполняется во O(n) времени
    и использует только постоянное вспомогательное пространство,
    исключая пространство, необходимое для хранения выходных данных.
     */

    public static List<Integer> findDuplicates(int[] nums) {
        if (nums.length == 1)
            return new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> arrDublicates = new ArrayList<>();
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] == nums[i + 1]) {
                arrDublicates.add(nums[i]);
                i++;
            }
            i++;
        }
        return arrDublicates;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }
}