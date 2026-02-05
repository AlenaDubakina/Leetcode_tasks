/*
Прошла серия беговых соревнований Rock’n’Run.
За каждый забег спортсмены получили очки.
Ваша задача — найти наибольшее количество очков среди всех результатов.
 */

package vk_tasks;

import java.util.Arrays;

public class RaceRecord {

    public static int raceRecord(int capacityArr, int[] points) {
        return Arrays.stream(points).max().orElse(0);
    }

    public static void main(String[] args) {
        System.out.println(raceRecord(5, new int[] {95, 87, 100, 92, 85}));
    }
}