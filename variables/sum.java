import java.util.*;

public class sum{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st no.: ");
        int a= sc.nextInt();
        System.out.print("Enter 2nd no.: ");
        int b= sc.nextInt();
        int sum=a+b;
        System.out.print("Sum of two number is: " + sum);
    }
}