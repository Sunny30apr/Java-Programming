import java.util.*;

public class Average {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter three number: ");
        double a=sc.nextInt();
        double b=sc.nextInt();
        double c=sc.nextInt();

        double average=(a+b+c)/3;
        System.out.print("Average of the three number: " + average);

    }
}