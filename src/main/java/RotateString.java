public class RotateString {
    /*
    Даны две строки sи goal, вернуть true тогда и только тогда,
    когда s может стать goal после некоторого количества сдвигов на s.
    Сдвиг заключается в перемещении крайнегоs левого символа sв крайнюю правую позицию.
    Например, если s = "abcde", то это будет "bcdea"через одну смену.
     */

    public static boolean rotateString(String s, String goal) {
        if ((s.length() != goal.length()) || s == null || goal == null) {
            return false;
        }
        return (s + s).contains(goal);
    }

    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "abced"));
    }
}