import java.util.*;

public class SumUptoN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num=sc.nextInt();

        int n=1, sum=0;
        while(n<=num) {
            sum+=n;
            n++;
        }
        System.out.print("Sum of first n natural numbers: " + sum);
    }
}