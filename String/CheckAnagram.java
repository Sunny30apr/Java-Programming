import java.util.Arrays;

public class CheckAnagram {
    public static boolean checkAnagram (String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if(s1.length() == s2.length()) {
            char[] s1charArray = s1.toCharArray();
            char[] s2charArray = s2.toCharArray();

            Arrays.sort(s1charArray);
            Arrays.sort(s2charArray);

            boolean result = Arrays.equals(s1charArray, s2charArray);
            return result;
        }

        return false;
        
    }

    public static void main(String args[]) {
        String str1="Triangle";
        String str2="Integral";

        if(checkAnagram(str1, str2)) {
            System.out.print(str1 + " and " + str2 + " are Anagrams");
        }
        else {
            System.out.print(str1 + " and " + str2 + " are not Anagrams");
        }
    }
}