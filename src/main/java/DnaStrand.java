public class DnaStrand {
    /*
    Дезоксирибонуклеиновая кислота (ДНК) — химическое вещество, содержащееся
    в ядре клеток и несущее «инструкции» по развитию и функционированию живых организмов.
    Если вы хотите узнать больше: http://en.wikipedia.org/wiki/DNA
    В строках ДНК символы "A" и "T" являются дополнениями друг друга, как "C" и "G".
    Ваша функция получает одну сторону ДНК (строки, за исключением Haskell);
    вам нужно вернуть другую, дополнительную сторону.
    Цепь ДНК никогда не бывает пустой или ДНК вообще нет (опять же, за исключением Haskell).
    Пример: ( вход -> выход )
    "ATTGC" --> "TAACG"
    "GTAT" --> "CATA"
     */

    public static String makeComplement(String dna) {
        String str = "";
        for (char el : dna.toCharArray()) {
            if (el == 'A') {
                str = str + 'T';
            }
            if (el == 'T') {
                str = str + 'A';
            }
            if (el == 'G') {
                str = str + 'C';
            }
            if (el == 'C') {
                str = str + 'G';
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(makeComplement("ATTGC"));
    }
}