public class AddDigits {
    /*
    Дано целое число num, последовательно сложите все его цифры,
    пока в результате не останется только одна цифра, и верните его.
     */

    public static int addDigits(int num) {
        if (num < 10) return num;
        StringBuilder stringBuilder = new StringBuilder(num + "");
        int sum = 0;
        while (stringBuilder.length() > 1) {
            for (int i = 0; i < stringBuilder.length(); i++) {
                sum += Character.getNumericValue(stringBuilder.charAt(i));
            }
            if (sum > 9) {
                stringBuilder = new StringBuilder(sum + "");
                sum = 0;
            } else {
                return sum;
            }
        }
        return sum;
    }

    public static int addTwoDigits(int num) {
        if (num == 0) return 0;
        return 1 + (num - 1) % 9;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(8));
        System.out.println(addTwoDigits(8));
    }
}