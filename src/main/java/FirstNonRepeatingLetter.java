public class FirstNonRepeatingLetter {
    /*
    Напишите функцию с именем first_non_repeating_letter,
    которая принимает на вход строку и возвращает первый символ,
    который не повторяется нигде в строке.
    Например, если заданы входные данные 'stress', функция должна вернуть 't,
    поскольку буква t встречается в строке только один раз и встречается в строке первой.
    В качестве дополнительной проблемы, заглавные и строчные буквы считаются одним и тем же символом,
    но функция должна возвращать правильный регистр для первой буквы.
    Например, ввод 'sTreSS' должен возвращать 'T'.
    Если строка содержит все повторяющиеся символы, она должна вернуть пустую строку ( "");
    Примечание: функция вызывается firstNonRepeating Letter по историческим причинам,
    но ваша функция должна обрабатывать любой символ Unicode.
     */

    public static String firstNonRepeatingLetter(String s) {
        if (s.length() == 1) return s;
        char[] arrChar = s.toCharArray();
        boolean el = false;
        for (int i = 0; i < arrChar.length; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (i != j && Character.toLowerCase(arrChar[i]) == Character.toLowerCase(s.charAt(j))) {
                    el = true;
                }
            }
            if (!el) {
                return "" + arrChar[i];
            } else {
                el = false;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingLetter("sTreSS"));
    }
}