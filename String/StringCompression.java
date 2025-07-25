import java.util.*;

public class StringCompression {
    public static String stringCompression(String s) {
        StringBuilder sb=new StringBuilder("");

        sb.append(s.charAt(0));
        int count=1;
        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i)==s.charAt(i-1)) {
                count++;
            }
            else {
                sb.append(count);
                sb.append(s.charAt(i));
                count=1;
            }
        }
        sb.append(count);
        if(sb.length()>s.length()) {
            return s;
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "abcd";

        System.out.print(stringCompression(str));
    }
}