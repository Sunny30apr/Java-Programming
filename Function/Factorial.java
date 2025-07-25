import java.util.*;

public class Factorial {
    public static int factorial(int a) {
        int ans=1;
        while(a>0) {
            ans*=a;
            a--;
        }
        return ans;
    }

    public static void main(String args[]) {
        int n=4;
        System.out.println("Number is: " + n);
        int fact = factorial(n);
        System.out.println("Factorial of number is: " + fact);
    }
}