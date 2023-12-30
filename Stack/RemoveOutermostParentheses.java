
//      1021. Remove Outermost Parentheses

package Stack;

import java.util.Stack;

public class RemoveOutermostParentheses {

    public static String removeParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                if (st.size() > 0) {
                    sb.append(ch);
                }
                st.push(ch);
            } else {
                st.pop();
                if (st.size() > 0) {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(s);
        System.out.println(removeParentheses(s));
    }
}
