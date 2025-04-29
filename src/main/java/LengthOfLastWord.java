public class LengthOfLastWord {
    /*
    Для заданной строки, sсостоящей из слов и пробелов, вернуть длину последнего слова в строке.
    Слово — это максимумподстрокасостоящий только из символов, не являющихся пробелами.
     */

    public static int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return arr[arr.length - 1].length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
}