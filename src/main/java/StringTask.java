import java.util.Arrays;

public class StringTask {
    /*
    Проверь, содержит ли строка только цифры.
     */

    public static boolean isContainsNumber(String str) {
        return str.chars().allMatch(Character::isDigit);
    }

    /*
    Удали пробелы из строки.
     */

    public static String removeSpace(String str) {
//        return str.replaceAll(" ", "");
        return str.replaceAll("\\s+", "");
    }

    /*
    Раздели строку по запятым и выведи элементы.
     */

    public static void elementStr(String str) {
        Arrays.stream(str.split(",")).forEach(System.out::println);
    }

    /*
    Замени все буквы 'a' на '@'.
     */

    public static String replaceChar(String str) {
        return str.replaceAll("a", "@");
    }

    /*
    Преобразуй первую букву каждого слова в верхний регистр.
     */

    public static String upperCaseFirstCharWord(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String el : str.split(" ")) {
            stringBuilder.append(Character.toUpperCase(el.charAt(0)))
                    .append(el.substring(1))
                    .append(" ");
        }
        return stringBuilder.toString().trim();
    }

    /*
    Обработай NullPointerException при работе со строкой
     */

    public static void exceptionString(String str) {
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println(isContainsNumber("12345"));
        System.out.println(isContainsNumber("banana123"));
        System.out.println(removeSpace(" banana 123 jieen"));
        elementStr("banana, apple, cat, dog");
        System.out.println(replaceChar("apple banana apple"));
        System.out.println(upperCaseFirstCharWord("apple banana apple"));
        exceptionString(null);
    }
}