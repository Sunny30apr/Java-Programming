import java.util.*;

public class CheckPalindrome {
    public static boolean checkPalindrome (String s) {
        int start=0, end=s.length()-1;

        boolean ans=true;
        while(start<=end) {
            if(s.charAt(start)!=s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String str = sc.next();

        if(checkPalindrome(str)) {
            System.out.println(str + " is Palindrome.");
        }
        else {
            System.out.println(str + " is not Palindrome.");
        }
    }
}