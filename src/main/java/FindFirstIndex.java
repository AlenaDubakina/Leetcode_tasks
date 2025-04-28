public class FindFirstIndex {
    /* Для двух строк needle и haystack вернуть индекс первого вхождения needle в haystack,
    или , -1 если needle не является частью haystack.
     */

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }
}