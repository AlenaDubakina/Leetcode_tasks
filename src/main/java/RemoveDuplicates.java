public class RemoveDuplicates {
    /* Дан целочисленный массив nums, отсортированный в неубывающем порядке ,
    удалить дубликаты на месте так, чтобы каждый уникальный элемент появлялся только один раз .
    Относительный порядок элементов должен оставаться прежним .
    Затем вернуть количество уникальных элементов вnums .
    */

    public static int removeDuplicates(int[] nums) {
        int[] uniqueArr = new int[nums.length];
        uniqueArr[0] = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != uniqueArr[count - 1]) {
                uniqueArr[count] = nums[i];
                count++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = uniqueArr[i];
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        System.out.println(removeDuplicates(arr));
    }
}