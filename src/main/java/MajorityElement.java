import java.util.Arrays;

public class MajorityElement {
    /*
    Учитывая массив nums размера n, вернуть элемент большинства.
    Элемент большинства — это элемент, который встречается чаще, чем [n / 2]раз.
    Можно предположить, что элемент большинства всегда присутствует в массиве.
     */

    public static int majorityElement(int[] nums) {
        int count = 0;
        int num = nums[0];
        int i = 0;
        Arrays.sort(nums);
        while (i < nums.length) {
            int searchNum = nums[i];
            long countArr = Arrays.stream(nums).filter(x -> x == searchNum).count();
            if (count < countArr) {
                count = (int) countArr;
                num = searchNum;
            }
            i = i + (int) countArr;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}