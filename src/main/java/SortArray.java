import java.util.Arrays;

public class SortArray {
    /*
    Вам будет дан массив чисел.
    Вам нужно отсортировать нечетные числа в порядке возрастания,
    оставив четные числа на своих исходных позициях.
     */

    public static int[] sortArray(int[] array) {
        int[] arr = Arrays.stream(array).filter(x -> x % 2 != 0).sorted().toArray();
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = arr[index];
                index++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{5, 3, 2, 8, 1, 4})));
    }
}