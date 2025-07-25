import java.util.*;

public class PositiveOrNegative {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter your number: ");
        int a=sc.nextInt();

        String status=(a>0) ? "Positive" : "Negaitve";
        System.out.print(status);
    }
}