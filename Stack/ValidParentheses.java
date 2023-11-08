//      20. Valid Parentheses

package Stack;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String t) {
        Stack<Character> s = new Stack<>();
        int n = t.length();
        for (int i = 0; i < n; i++) {
            char ch = t.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            } else {
                if (s.size() == 0) {
                    return false;
                }
                if (s.peek() == '(' && ch == ')' || s.peek() == '[' && ch == ']' || s.peek() == '{' && ch == '}') {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.size() > 0)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        String t = "({}[])";
        System.out.println(t);
        System.out.println("String is Valid or Not: " + isValid(t));
    }
}
