import java.util.*;

public class SubString {
    public static String subString(String s, int start, int end) {
        String substr = ""; 
        for(int i=start; i<end; i++) {
            substr += s.charAt(i);
        }
        return substr;
    }
    
    public static void main(String args[]) {
        String str = "HelloWorld";

        System.out.println(str.substring(0, 5));
        System.out.print(subString(str, 0, 5));
    }
}