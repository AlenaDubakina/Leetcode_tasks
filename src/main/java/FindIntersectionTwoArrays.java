/*
    Найти общие элементы двух массивов (с учетом дубликатов)
    Пример: [1,2,2,1] и [2,2] → [2,2]
 */

import java.util.*;

public class FindIntersectionTwoArrays {

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> mapArr1 = new HashMap<>();
        Map<Integer, Integer> mapArr2 = new HashMap<>();

        List<Integer> listIntersection = new ArrayList<>();

        for (Integer el : nums1) {
            mapArr1.merge(el, 1, Integer::sum);
        }

        for (Integer el : nums2) {
            mapArr2.merge(el, 1, Integer::sum);
        }

        for (Map.Entry<Integer, Integer> entry : mapArr1.entrySet()) {
            if (mapArr2.containsKey(entry.getKey())) {
                int n = entry.getValue() <= mapArr2.get(entry.getKey())
                        ? entry.getValue()
                        : mapArr2.get(entry.getKey());

                for (int i = 0; i < n; i++) {
                    listIntersection.add(entry.getKey());
                }
            }
        }

        return listIntersection.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString
                (intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }
}