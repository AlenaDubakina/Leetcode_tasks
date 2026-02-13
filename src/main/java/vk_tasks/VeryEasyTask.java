/*
Сегодня утром жюри решило добавить в вариант
олимпиады ещё одну «очень лёгкую» задачу.

Ответственный секретарь оргкомитета напечатал
её условие в одном экземпляре, и теперь ему
нужно до начала олимпиады успеть сделать ещё N копий.

В его распоряжении имеются два ксерокса, один из
которых копирует лист за X минут, а другой — за Y.
Разрешается использовать как один ксерокс, так и
оба одновременно. Можно копировать не только с
оригинала, но и с копии.

Помогите ему выяснить, какое минимальное время
для этого потребуется.
 */

package vk_tasks;

public class VeryEasyTask {
    public static int veryEasyTask(int n, int time1, int time2) {
        int left = 0;
        int right = (n - 1) * Math.max(time1, time2);

        while (left + 1 < right) {
            int middle = (right + left) / 2;
            if (middle / time1 + middle / time2 < n - 1) {
                left = middle;
            } else if (middle / time1 + middle / time2 > n - 1) {
                right = middle;
            } else {
                return middle;
            }
        }
        return right + Math.min(time1, time2);
    }

    public static void main(String[] args) {
        System.out.println(veryEasyTask(10, 1, 2));
    }
}