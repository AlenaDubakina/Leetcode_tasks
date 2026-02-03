/*
В школе прошёл экзамен по математике.
Некоторые ученики списали решения, были замечены и получили 0 баллов.
Помогите учителю пересортировать оценки учеников.
Все оценки, равные 0, должны быть перемещены в конец списка,
при этом порядок остальных оценок должен остаться неизменным.
*/

package vk_tasks;

public class CheatingAtSchool {
    public static String sortingGrades(String countGrades, String grades) {
        String[] arrGrades = grades.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        int countZero = 0;

        for (int i = 0; i < arrGrades.length; i++) {
            if (!arrGrades[i].equals("0")) {
                stringBuilder.append(arrGrades[i]).append(" ");
            } else {
                countZero++;
            }
        }

        for (int i = 0; i < countZero; i++) {
            stringBuilder.append("0 ");
        }

        return stringBuilder.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(sortingGrades("6", "6 0 7 0 9 8"));
    }
}