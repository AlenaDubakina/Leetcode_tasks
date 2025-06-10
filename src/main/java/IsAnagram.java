import java.util.Arrays;

public class IsAnagram {
    /*
    Даны две строки sи t, вернуть, trueесли tэтоанаграммаиз s, и falseв противном случае.
    Пример 1:
    Ввод: s = "анаграмма", t = "нагарам"
    Вывод: истина

    Пример 2:
    Ввод: s = "крыса", t = "автомобиль"
    Вывод: ложь
     */

    public static boolean isAnagram(String s, String t) {
        if (s.length() == t.length()) {
            char[] arrS = s.toCharArray();
            char[] arrT = t.toCharArray();
            Arrays.sort(arrS);
            Arrays.sort(arrT);

            for (int i = 0; i < arrS.length; i++) {
                if (arrS[i] != arrT[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}