import java.util.Arrays;
import java.util.HashMap;

public class TwoSumMap {
    public static int[] twoSum(int[] nums, int target) {
        int[] indexTarget = new int[2];

        HashMap<Integer, Integer> mapArr = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mapArr.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (mapArr.containsKey(target - nums[i]) && (mapArr.get(target - nums[i]) != i)) {
                indexTarget[0] = i;
                indexTarget[1] = mapArr.get(target - nums[i]);
                break;
            } else {
                mapArr.remove(target - nums[i]);
            }
        }
        return indexTarget;
    }

    public static int[] twoSumVariant(int[] nums, int target) {
        int[] indexTarget = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == (target - nums[i])) {
                    indexTarget[0] = i;
                    indexTarget[1] = j;
                    return indexTarget;
                }
            }
        }
        return indexTarget;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3}, 5)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
    }
}