import java.util.Arrays;
import java.util.HashSet;

public class Duplicate {
    /*
    Дан массив целых чисел nums, вернуть значение true,
    если какое-либо значение встречается в массиве хотя бы дважды false,
    и вернуть значение, если каждый элемент является уникальным.
     */

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> unicEl = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            unicEl.add(nums[i]);
        }
        return nums.length != unicEl.size();
    }

    public static boolean containsDuplicateTwo(int[] nums) {
       long unicCount = Arrays.stream(nums).distinct().count();
        return unicCount != nums.length;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(containsDuplicateTwo(new int[]{1, 2, 3, 1}));
    }
}