import java.util.*;

public class SumOfN {
    public static int sumOfN(int num) {
        if(num==0) {
            return 0;
        }
        return sumOfN(num-1)+num;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num: ");
        int n=sc.nextInt();

        System.out.print("Sum of first " + n + " natural numbers: " + sumOfN(n));

    }
}