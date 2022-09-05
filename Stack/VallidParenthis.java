package Stack;

import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/

public class VallidParenthis {
    public static void main(String[] args) {
        String s = "";
        System.out.println(isValid(s));
    }

    static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(' || arr[i] == '[' || arr[i] == '{') {
                st.push(arr[i]);
            } else {
                if (st.empty()) {
                    return false;
                }
                char ob = st.pop();

                if ((ob == '(' && arr[i] == ')') || (ob == '[' && arr[i] == ']') || (ob == '{' && arr[i] == '}')) {
                    continue;
                } else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}
