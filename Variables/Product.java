import java.util.*;

public class Product{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st no.: ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd no.: ");
        int b=sc.nextInt();
        int product=a*b;
        System.out.print("Product of two number: " + product);
    }   
}