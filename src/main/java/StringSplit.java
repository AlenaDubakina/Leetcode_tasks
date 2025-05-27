import java.util.Arrays;

public class StringSplit {
    /*
    Завершите решение так, чтобы оно разделило строку на пары из двух символов.
    Если строка содержит нечетное количество символов,
    то следует заменить отсутствующий второй символ последней пары подчеркиванием ('_').
     */

    public static String[] solution(String s) {
        if (s.length() == 0) return new String[]{};

        String str = "";

        for (int i = 0; i < s.length(); i++) {
            str = str + s.charAt(i);
            if ((i % 2 != 0) && i != (s.length() - 1)) {
                str = str + ",";
            }
            if (i == (s.length() - 1) && (i % 2 == 0)) {
                str = str + '_';
            }
        }

        return str.split(",");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abcd")));
    }
}