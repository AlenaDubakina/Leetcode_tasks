import java.util.Arrays;

public class BuildArray {
    /*
    Для заданной перестановки, начинающейся с нуля nums ( с индексом 0 ),
    создайте массив ans той же длины, где ans[i] = nums[nums[i]]
    для каждого элемента 0 <= i < nums.length, и верните его.
    Перестановка с нулевой базой nums — это массив различных целых чисел
    от 0 до nums.length - 1( включительно ).
     */

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};

        System.out.println(Arrays.toString(buildArray(nums)));
    }
}