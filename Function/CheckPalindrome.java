import java.util.*;

public class CheckPalindrome {
    public static int reverse(int num) {
        int ans=0;
        while(num>0) {
            int digit=num%10;
            ans=ans*10+digit;
            num/=10;
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n=sc.nextInt();

        int rev=reverse(n);
        if(n==rev) {
            System.out.print(n + " is a Palindrome number.");
        }
        else {
            System.out.print(n + " is not a Palindrome number.");
        }

    }
}