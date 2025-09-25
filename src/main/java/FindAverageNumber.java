import java.util.Arrays;
import java.util.List;

public class FindAverageNumber {
    public static double findAverageNumber(List<Integer> numbers) {
        double sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }

    public static double findAverageNumberStream(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).average().getAsDouble();
    }

    public static void main(String[] args) {
        System.out.println(findAverageNumber(Arrays.asList(1, 2, 3, 4)));
        System.out.println(findAverageNumberStream(Arrays.asList(1, 2, 3, 4)));
    }
}