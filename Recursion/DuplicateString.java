import java.util.*;

public class DuplicateString {
    public static String removeDuplicates(String str, int idx, StringBuilder sb, boolean[] charRec) {
        if (idx == str.length()) {
            return sb.toString();
        }

        char currChar = str.charAt(idx);
        if (charRec[currChar - 'a']) {
            return removeDuplicates(str, idx + 1, sb, charRec);
        } else {
            charRec[currChar - 'a'] = true;
            sb.append(currChar);
            return removeDuplicates(str, idx + 1, sb, charRec);
        }
    }

    public static void main(String args[]) {
        String str = "appnnacollege";
        StringBuilder sb = new StringBuilder("");
        boolean[] charRec = new boolean[26];
        System.out.println(removeDuplicates(str, 0, sb, charRec));
    }
}
