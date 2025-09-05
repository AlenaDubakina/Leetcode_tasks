import java.util.*;

/*
Даны два целочисленных массива nums1 и nums2, вернуть массив их пересечения.
Каждый элемент в результате должен встречаться столько раз, сколько он встречается в обоих массивах,
и результат можно возвращать в любом порядке.
 */

public class IntersectArray {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> intersectMap1 = new HashMap<>();

        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            intersectMap1.put(nums1[i], intersectMap1.getOrDefault(nums1[i], 0) + 1);
        }

        for (int i = 0; i < nums2.length; i++) {
            for (Map.Entry<Integer, Integer> entry : intersectMap1.entrySet()) {
                if (entry.getKey().equals(nums2[i]) && !entry.getValue().equals(0)) {
                    resultList.add(nums2[i]);
                    entry.setValue(entry.getValue() - 1);
                    break;
                }
            }
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] intersect2(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> intersectMap1 = new HashMap<>();

        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            intersectMap1.put(nums1[i], intersectMap1.getOrDefault(nums1[i], 0) + 1);
        }

        for (int el : nums2) {
            if (intersectMap1.containsKey(el)) {
                resultList.add(el);
                intersectMap1.put(el, intersectMap1.get(el) - 1);
            }
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
        System.out.println(Arrays.toString(intersect2(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }
}