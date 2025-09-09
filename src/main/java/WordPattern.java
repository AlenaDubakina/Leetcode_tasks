/*
Даны a pattern и строка s, найдите, s следует ли она тому же шаблону.
Здесь «следовать» означает полное совпадение, при котором существует
биекция между буквой в строке pattern и непустым словом в строке s.
А именно:
Каждая буква в pattern соответствует ровно одному уникальному слову в s.
Каждое уникальное слово в s соответствует ровно одной букве в pattern.
Никакие две буквы не соответствуют одному и тому же слову,
и никакие два слова не соответствуют одной и той же букве.
 */

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        String[] sArr = s.split(" ");

        if (sArr.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            for (int j = 0; j < pattern.length(); j++) {
                if (i != j && pattern.charAt(i) == pattern.charAt(j)) {
                    if (!sArr[i].equals(sArr[j])) {
                        return false;
                    }
                }
                if (i != j && pattern.charAt(i) != pattern.charAt(j)) {
                    if (sArr[i].equals(sArr[j])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog dog dog dog"));
        System.out.println(wordPattern("abba", "dog cat cat"));
    }
}