import java.util.*;

public class DuplicateParenthesis {
    public static boolean duplicateParenthesis(String str) {
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch != ')') {
                s.push(ch);
            }
            else {
                int count = 0;
                while(s.pop() != '(') {
                    count++;
                }
                if(count < 1) {
                    return true;
                }
            }   
        }
        return false;
    }

    public static void main(String args[]) {
        String s = "(((a+b)+(c+d)))";
        System.out.print(duplicateParenthesis(s));
    }
}