import java.util.*;

public class TotalCost {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter cost of pencil, pen, eraser: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        double cost=(double)(a+b+c)+(double)(0.18*(a+b+c));
        System.out.println("Costs of each item: ");
        System.out.println("Pencil: " + a);
        System.out.println("Pen: "+b);
        System.out.println("Eraser: "+c);
        System.out.println("Total Cost with 18% GST: "+cost);
    }
}