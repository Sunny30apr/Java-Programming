import java.util.*;

public class Fibonacci {
    public static int fibonacci(int num) {
        if(num==1) {
            return 0;
        }
        if(num==2) {
            return 1;
        }

        return fibonacci(num-1)+fibonacci(num-2);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num: ");
        int n=sc.nextInt();

        System.out.print("Fibonacci number at " + n + " positions is: " + fibonacci(n));
    }
}