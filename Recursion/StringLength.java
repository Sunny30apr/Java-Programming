import java.util.*;

public class StringLength {
   public static int length(String str) {
        if(str.isEmpty()) {
            return 0;
        }
        return length(str.substring(1)) + 1;
    }

    public static void main(String[] args) {
        String str = "apple";
        System.out.println(length(str));
        }
    }