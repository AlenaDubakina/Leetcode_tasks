/*
Дан массив целых чисел nums и целое число k.
Верните наиболее k часто встречающиеся элементы.
Вы можете вернуть ответ в любом порядке .
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TopKFrequent {
    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> arr = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            arr.put(nums[i], arr.getOrDefault(nums[i], 0) + 1);
        }
        int i = 0;
        while (i < k) {
            Optional<Map.Entry<Integer, Integer>> maxArr = arr.entrySet()
                    .stream()
                    .max(Map.Entry.comparingByValue());

            result[i] = maxArr.get().getKey();
            arr.remove(result[i]);
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    }
}