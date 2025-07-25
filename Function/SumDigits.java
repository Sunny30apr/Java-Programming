import java.util.*;

public class SumDigits {
    public static  int sumDigits(int n) {
        int sum=0;
        while(n>0) {
            int digit=n%10;
            sum+=digit;
            n/=10;
        }
        return sum;
    }

    public static void main(String args[]) {
        int n=12345;

        int ans=sumDigits(n);
        System.out.print("Sum of digits of " + n + " is: " + ans);
    }
}