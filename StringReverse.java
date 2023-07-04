import java.util.Stack;

public class StringReverse {
    public static void main(String[] args) {
        String str = "abcd";

        String reverse = rev(str);

        System.out.println(reverse);
    }

    public static String rev(String str){
        Stack<Character> st = new Stack<>();

        for(int i=0;i<str.length();i++){
            st.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
           sb.append(st.pop());
        }

        return sb.toString();
    }
}
