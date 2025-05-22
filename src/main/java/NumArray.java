public class NumArray {
    /*
    Дан целочисленный массив nums, обработайте несколько запросов следующего типа:
    Вычислить сумму элементов numsмежду индексами left и right включительно , где left <= right.
    Реализуйте NumArray класс:
    NumArray(int[] nums)
    Инициализирует объект с помощью целочисленного массива nums.
     */

    int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += nums[i];
        }
        return sum;

//        int[] newArr = Arrays.copyOfRange(nums, left, right + 1);
//        return Arrays.stream(newArr).sum();
    }

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray arr = new NumArray(nums);
        System.out.println(arr.sumRange(0, 2));
    }
}