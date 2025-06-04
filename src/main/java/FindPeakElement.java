public class FindPeakElement {
    /*
    Пиковый элемент — это элемент, который строго больше своих соседей.
    Дано целочисленное множество с индексом 0 nums, найти элемент пика и вернуть его индекс.
    Если массив содержит несколько пиков, вернуть индекс любого из пиков.
    Вы можете себе представить, что nums[-1] = nums[n] = -∞.
    Другими словами, элемент всегда считается строго большим, чем сосед, который находится за пределами массива.
     */

    public static int findPeakElement(int[] nums) {
        if (nums.length == 1) return 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if (nums[i] > nums[i + 1]) {
                    index = i;
                    break;
                }
            } else if (i == (nums.length - 1)) {
                if (nums[i] > nums[i - 1]) {
                    index = i;
                    break;
                }
            } else if ((nums[i] > nums[i - 1]) && (nums[i + 1] < nums[i])) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[]{1, 2, 3}));
    }
}