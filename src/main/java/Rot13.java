import java.util.Arrays;
import java.util.stream.Collectors;

public class Rot13 {
    /*
    ROT13 — это простой шифр замены букв, который заменяет букву на букву,
    стоящую на 13-й букве после нее в алфавите. ROT13 — это пример шифра Цезаря.
    Создайте функцию, которая принимает строку и возвращает строку, зашифрованную с помощью Rot13.
    Если в строке есть цифры или специальные символы, они должны быть возвращены как есть.
    Только буквы латинского/английского алфавита должны быть смещены, как в оригинальной "реализации" Rot13.
     */
    public static String rot13(String str) {
        char[] arrToUpper = new char[26];
        String result = "";
        int index = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            arrToUpper[index] = i;
            index++;
        }

        for (char el : str.toCharArray()) {
            if ((el + "").matches("[a-zA-Z]")) {
                int searchIndex = Arrays.binarySearch(arrToUpper, Character.toLowerCase(el));
                int ind = (searchIndex + 13) > 25 ? (searchIndex + 13 - 26) : (searchIndex + 13);
                if (Character.isUpperCase(el)) {
                    result = result + Character.toUpperCase(arrToUpper[ind]);
                } else {
                    result = result + arrToUpper[ind];
                }
            } else {
                result = result + el;
            }

        }
        return result;
    }

    public static String rot13Variant(String str){
        return str
                .chars()
                .mapToObj(c -> {
                    if (c >= 'a' && c <= 'z') {
                        return Character.toString((c + 13) > 'z' ? (c - 13) : c + 13);
                    }
                    if (c >= 'A' && c <= 'Z') {
                        return Character.toString((c + 13) > 'Z' ? (c - 13) : c + 13);
                    }
                    return Character.toString(c);
                })
                .collect(Collectors.joining());
    }
    public static void main(String[] args) {
        System.out.println(rot13("T+est"));
        System.out.println(rot13Variant("T+est"));
    }
}