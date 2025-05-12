import java.util.Arrays;

public class NumJewelsInStones {
    /*
    Вам даны строки, jewels представляющие типы камней, которые являются драгоценностями,
    и stones представляющие камни, которые у вас есть.
    Каждый символ в stones— это тип камня, который у вас есть.
    Вы хотите узнать, сколько из камней, которые у вас есть, также являются драгоценностями.
    Буквы чувствительны к регистру, поэтому "a"считается другим типом камня, нежели "A".
     */

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        char[] jewelsArr = jewels.toCharArray();
        Arrays.sort(jewelsArr);
        for (char el : stones.toCharArray()) {
            if (Arrays.binarySearch(jewelsArr, el) >= 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }
}