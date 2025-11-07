import java.util.Stack;

public class ValidParentheses {

    public static boolean isValidParentheses(String s) {
        if (s.length() % 2 != 0) return false;

        for (int i = 0; i < s.length(); i++) {
            s = s.replace("{}", "")
                    .replace("[]", "")
                    .replace("()", "");
        }

        if (s.length() == 0) return true;

        return false;
    }

    public static boolean isValidParenthesesStack(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> stackBranches = new Stack<>();

        for (char el : s.toCharArray()) {
            if (stackBranches.isEmpty() && (el == '}' || el == ')' || el == ']')) return false;

            if (el == '{' || el == '(' || el == '[') {
                stackBranches.push(el);
            } else {
                char lastEl = stackBranches.pop();
                if ((lastEl == '{' && el != '}') ||
                        (lastEl == '(' && el != ')') ||
                        (lastEl == '[' && el != ']'))
                    return false;
            }
        }

        return stackBranches.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValidParentheses("({[]})"));
        System.out.println(isValidParenthesesStack("({[]})"));
    }
}