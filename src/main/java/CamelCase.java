public class CamelCase {
    /*
    Завершите решение так, чтобы функция разрывала верблюжий регистр, используя пробел между словами.
     */

    public static String camelCase(String input) {
        String str = "";
        for (int i = 0; i < input.length(); i++) {
            str = str + input.charAt(i);
            if (i != (input.length() - 1) &&
                    input.charAt(i + 1) == Character.toUpperCase(input.charAt(i + 1))) {
                str = str + " ";
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(camelCase("camelCasing"));
    }
}