public class Scramblies {
    /*
    Завершите функцию scramble(str1, str2), которая возвращает значение , true
    если часть str1 символов можно переставить так, чтобы они совпадали str2,
    в противном случае возвращает значение false.
    Примечания:
    Будут использоваться только строчные буквы (az). Знаки препинания и цифры не будут включены.
     */

    public static boolean scramble(String str1, String str2) {
        StringBuilder stringBuilder = new StringBuilder(str1);
        for (char el : str2.toCharArray()) {
            if (stringBuilder.indexOf("" + el) == -1) {
                return false;
            } else {
                int index = stringBuilder.indexOf("" + el);
                stringBuilder.deleteCharAt(index);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(scramble("rkqodlw", "world"));
    }
}