/*
    Переводчик с русского на выдуманный прусский: принимается предложение.
    Необходимо каждому слову в предложении прибавить в начале букву п и вывести в консоль результат.
 */

public class Translator {
    public static void translator(String strs) {
        String newStr = "";

        String[] arrStr = strs.split(" ");

        for (int i = 0; i < arrStr.length; i++) {
            newStr = newStr + "п" + arrStr[i] + " ";
        }

        System.out.println(newStr.trim());
    }

    public static void main(String[] args) {
        translator("Программа должна выводить следующую информацию");
    }
}