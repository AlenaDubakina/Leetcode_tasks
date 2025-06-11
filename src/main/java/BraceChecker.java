public class BraceChecker {
    /*
    Напишите функцию, которая принимает строку фигурных скобок и определяет,
    является ли порядок фигурных скобок допустимым.
    Она должна возвращать true, является ли строка допустимой, а false если нет.
     */

    public static boolean isValid(String braces) {
        int lengthOfBraces = braces.length();
        for (int i = 0; i < lengthOfBraces; i++) {
            braces = braces.replace("{}", "").replace("[]", "").replace("()", "");
            if (braces.length() == 0) {
                return true;
            }
        }
        return braces.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("{({})}"));
    }
}