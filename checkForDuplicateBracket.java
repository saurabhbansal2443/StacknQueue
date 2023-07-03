import java.util.*;

public class checkForDuplicateBracket {
    public static void main(String[] args) {

        String str1 = "(a+b+((a-b)))";
        String str2 = "(a+b+(a-b))";

        boolean ans = check(str2);

        System.out.println(ans);
    }

    public static boolean check(String str) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')' && st.peek() == '(') {
                return false;
            } else if (ch == ')') {
                while (st.peek() != '(') {
                    st.pop();
                }
                st.pop();
            } else {
                st.push(ch);
            }
        }

        return true;

    }
}
