import java.util.*;

public class Factorial {
    public static int factorial(int num) {
        if(num==0) {
            return 1;
        }

        return factorial(num-1)*num;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num: ");
        int n=sc.nextInt();

        System.out.print("Factorial of " + n + " is: " + factorial(n));
    }
}