import java.util.*;

public class ValidParenthesis {
    public static boolean validParenthesis(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            }
            else {
                if(s.isEmpty()) {
                    return false;
                }
                else if(ch == ']') {
                    if(s.peek() == '[') {
                        s.pop();
                    }
                }
                else if(ch == '}') {
                    if(s.peek() == '{') {
                        s.pop();
                    }
                }
                else if(ch == ')') {
                    if(s.peek() == '(') {
                        s.pop();
                    }
                }
                else {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }

    public static void main(String args[]) {
        String str = "(()[]{})";
        System.out.print(validParenthesis(str));
    }
}