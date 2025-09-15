import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Найти второй по величине элемент в списке
 */

public class FindSecondElement {

    public static int findSecondElement(List<Integer> listNumber) {
        if (listNumber.size() < 2) return 0;
        List<Integer> sortList = listNumber.stream().distinct().sorted().collect(Collectors.toList());
        return sortList.size() >= 2 ? sortList.get(sortList.size() - 2) : 0;
    }

    public static void main(String[] args) {
        System.out.println(findSecondElement(Arrays.asList(5, 5, 5)));
        System.out.println(findSecondElement(Arrays.asList(6)));
        System.out.println(findSecondElement(Arrays.asList(5, 10, 10, 35, 7, 35, 8, 35)));
    }
}