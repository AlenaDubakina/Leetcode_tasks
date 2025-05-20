import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDiff {
    /*
    Реализуйте функцию, которая вычисляет разницу между двумя списками.
    Функция должна удалить все вхождения элементов из первого списка ( a),
    которые присутствуют во втором списке ( b).
    Порядок элементов в первом списке должен быть сохранен в результате.
     */

    public static int[] arrayDiff(int[] a, int[] b) {
        if (b.length == 0) return a;
        List<Integer> list = new ArrayList<>();
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            if (Arrays.binarySearch(b, a[i]) < 0) {
                list.add(a[i]);
            }
        }
        int[] newArr = new int[list.size()];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = list.get(i);
        }
        return newArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff
                (new int[]{0, -12, 20, 1, 20, -15, 15, -8, -19, -19, 1, 2, 3, 17, -3, -5, 19, -16, -18},
                        new int[]{0, -12, 20, 1, 20, -15, 15, -8, -19, -19, 1, 2, 3, 17, -3})));
    }
}