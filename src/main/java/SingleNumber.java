import java.util.Arrays;

public class SingleNumber {
    /*
    Дан непустой  массив целых чисел nums, каждый элемент встречается дважды,
    за исключением одного. Найдите этот единственный.
    Необходимо реализовать решение с линейной сложностью выполнения и
    использовать только постоянное дополнительное пространство.
     */

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                return nums[i];
            }
            if (nums[i] == nums[i + 1]) {
                i++;
            } else {
                return nums[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 5};
        System.out.println(singleNumber(nums));
    }
}